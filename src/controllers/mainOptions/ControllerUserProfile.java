
package controllers.mainOptions;

// Se importan las models a utilizar.
import models.Employee;
import models.User;
import models.database.EmployeeDB;
import models.database.UserDB;

// Se importan las views a utilizar.
import views.PopupMessage;
import views.SelectOption;
import views.mainOptions.UserProfile;

// Se importan las clases de soporte a utilizar.
import lib.SupportFunctions;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class ControllerUserProfile implements java.awt.event.ActionListener{
    
    private UserProfile             profile;
    
    private SelectOption            select;
    private PopupMessage            popup;
    
    private SupportFunctions        support;
    
    private User                    user, 
                                    updateUser;
    
    private Employee                employee,
                                    updateEmployee;
    
    private UserDB                  userDB      = new UserDB();
    private EmployeeDB              employeeDB  = new EmployeeDB();
    
    private JFrame                  frame;
    private JButton                 btnProfile;
    
    public ControllerUserProfile(JFrame frame, JPanel parent, JButton btnProfile, User user) {
        
        this.frame      = frame;
        this.btnProfile = btnProfile;
                                
        this.user = user;
        this.employee = consultUserData(this.user.getEmail());
        
        // Se instancian las variables a utilzar.
        support         = new SupportFunctions();
        profile         = new UserProfile();
                
        if(this.user.getPhoto() != null) {
                          
            Icon photo  = new ImageIcon(
                    ((ImageIcon) this.user.getPhoto()).getImage().getScaledInstance(                          
                        200, 
                        200, 
                        Image.SCALE_DEFAULT
                    )
            );
            
            profile.lblProfilePhotoUser.setText(null);
            profile.lblProfilePhotoUser.setIcon(photo);

        }
        
        profile.txtUserDNI.setText(employee.getDni());
        profile.txtUserName.setText(employee.getName());
        profile.txtUserSurname.setText(employee.getSurname());
        profile.dtcUserBirthday.setDate(employee.getBirthday());
        profile.txtUserPhone.setText(String.valueOf(employee.getPhone()));
        profile.txtUserDirection.setText(employee.getDirection());
        profile.txtUserEmail.setText(user.getEmail());
        profile.pssUser.setText(user.getPassword());
        
        userPermits(user.getUserTypeId());
        
        profile.addActionEvents(this);
        
        support.cardSelection(parent, profile);
                              
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
     
        // Cambiar foto de perfil.
        if(evt.getSource() == profile.btnChangePhoto) {
            
            javax.swing.JFileChooser FileChooser = new javax.swing.JFileChooser();
            
            FileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
            
            FileChooser.setFileFilter(
                    new javax.swing.filechooser.FileNameExtensionFilter(
                            "JPG", 
                            "PNG", 
                            "GIF", 
                            "jpg", 
                            "png", 
                            "gif"
                    )
            );
                        
            int selectedOption = FileChooser.showOpenDialog(frame);
            
            if(selectedOption == javax.swing.JFileChooser.APPROVE_OPTION) {
                
                java.io.File file = FileChooser.getSelectedFile();
                 
                ImageIcon img = new ImageIcon(file.toString());

                Icon photo  = new ImageIcon(img.getImage().getScaledInstance(                          
                        profile.lblProfilePhotoUser.getWidth(), 
                        profile.lblProfilePhotoUser.getHeight(), 
                        Image.SCALE_DEFAULT
                ));

                Icon minip  = new ImageIcon(img.getImage().getScaledInstance(                          
                        btnProfile.getWidth(), 
                        btnProfile.getHeight(), 
                        Image.SCALE_DEFAULT
                ));

                user.setPhoto(photo);
                profile.lblProfilePhotoUser.setText(null);
                profile.lblProfilePhotoUser.setIcon(photo);

                btnProfile.setIcon(minip);

                userDB.updatePhoto(user.getId(), file);

                popup = new PopupMessage(
                        frame, 
                        true, 
                        15, 
                        "La imagen de perfil ha sido actualizada."
                );
                             
            }
            
        }
        
        // Eliminar foto de perfil.
        else if(evt.getSource() == profile.btnDeletePhoto) {
            
            if(user.getPhoto() != null) {
                            
                select = new SelectOption(
                        frame, 
                        true, 
                        10, 
                        "¿Desea realmente eliminar su foto de perfil?", 
                        "Si", 
                        "No"
                );
                
                if(select.getOpc()) {
                    
                    userDB.deletePhoto(user.getEmail());

                    user.setPhoto(null);
                    profile.lblProfilePhotoUser.setText("Sin imagen");
                    profile.lblProfilePhotoUser.setIcon(null);

                    btnProfile.setIcon(
                            support.iconResource(
                                    "/views/images/medium/accountProfileIcon32.png"
                            )
                    );

                    popup = new PopupMessage(
                            frame, 
                            true, 
                            15, 
                            "La imagen de perfil ha sido actualizada."
                    );
                    
                }
                               
            } 
            
        }
        
        // Ver u ocultar contraseña
        else if(evt.getSource() == profile.tgbShowPass) {
            
            // Si el toggleButton es seleccionado la contraseña será visible.
            if(profile.tgbShowPass.isSelected())
                profile.pssUser.setEchoChar((char) 0);
            
            // Caso contrario; Si se deselecciona el toggleButton, se oculta la contraseña.
            else 
                profile.pssUser.setEchoChar('*');
            
        }
        
        // Limpiar información.
        else if(evt.getSource() == profile.btnClearData) {
            
            profile.txtUserDNI.setText(employee.getDni());
            profile.txtUserName.setText(employee.getName());
            profile.txtUserSurname.setText(employee.getSurname());
            profile.dtcUserBirthday.setDate(employee.getBirthday());
            profile.txtUserPhone.setText(String.valueOf(employee.getPhone()));
            profile.txtUserDirection.setText(employee.getDirection());
            profile.txtUserEmail.setText(user.getEmail());
            profile.pssUser.setText(user.getPassword());
            
        }
        
        // Actualizar información.
        else if(evt.getSource() == profile.btnUpdateData) {
            
            updateUser = new User(
                    user.getId(), 
                    user.getUserTypeId(), 
                    profile.txtUserEmail.getText(),
                    new String(profile.pssUser.getPassword()),
                    user.getRememberData(),
                    user.getState(),
                    user.getFirstSession(),
                    user.getLastSession(),
                    user.getPhoto()
            );
            
            updateEmployee = new Employee(
                    employee.getEnterpriseId(),
                    employee.getEnterpriseId(),
                    profile.txtUserName.getText(),
                    profile.txtUserSurname.getText(),
                    profile.dtcUserBirthday.getDate(),
                    Long.valueOf(profile.txtUserPhone.getText()),
                    profile.txtUserDirection.getText(),
                    profile.txtUserEmail.getText(),
                    employee.getState(),
                    profile.txtUserDNI.getText(),
                    employee.getAdmissionDate()
            );
            
            if(!user.equals(updateUser) && !employee.equals(updateEmployee)) {
                
                select = new SelectOption(
                        frame, 
                        true, 
                        10, 
                        "¿Desea actualizar sus datos?", 
                        "Si", 
                        "No"
                );

                if(select.getOpc()) {

                    

                }
                
            }
            
        }
        
    }
     
    private Employee consultUserData(String email) {
        
        // Se instancia la clase a utilizar.
        employeeDB = new EmployeeDB();
        
        Employee supportEmployee = null;
        
        // Se declara la variable que devuelve el resultado.
        java.sql.ResultSet result;
                
        try {
            
            result = employeeDB.consultOneEmployeeFromEmail(email);
            
            while(result.next()){
                supportEmployee = new Employee(
                        result.getInt("id"), 
                        result.getInt("Enterpriseid"),
                        result.getString("name"),
                        result.getString("surname"),
                        result.getDate("birthday"),
                        result.getLong("phone"), 
                        result.getString("direction"),
                        result.getString("Useremail"), 
                        result.getString("state").charAt(0),
                        result.getString("dni"),
                        result.getDate("admissionDate")
                );
            }
                                    
            System.out.println("Éxito.");
            
            return supportEmployee;
                                    
        } catch (java.sql.SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return null;
        
    }
    
    /**
     * Método para permitir al usuario modificar información dependiendo del 
     * tipo de usuario.
     * @param type Tipo de usuario.
     */
    private void userPermits(int type){
        
        if(type != 0) {
            
            profile.txtUserDNI.setEditable(false);
            profile.txtUserName.setEditable(false);
            profile.txtUserSurname.setEditable(false);
            profile.dtcUserBirthday.setEnabled(false);
            profile.txtUserEmail.setEditable(false);          
            
        }
        
    }
    
}
