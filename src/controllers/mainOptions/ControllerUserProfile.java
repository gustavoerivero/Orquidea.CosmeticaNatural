
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
    
    private User                    user;
    private Employee                employee;
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
        profile         = new UserProfile(this.user.getPhoto());
                
        support.cardSelection(parent, profile);
            
        profile.addActionEvents(this);
                                     
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
     
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
        
        else if(evt.getSource() == profile.btnDeletePhoto) {
            
            if(user.getPhoto() != null) {
                            
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
    
}
