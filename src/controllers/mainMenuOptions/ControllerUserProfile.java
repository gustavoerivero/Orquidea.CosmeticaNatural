
package controllers.mainMenuOptions;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import models.User;
import models.Employee;
import models.database.UserDB;
import models.database.EmployeeDB;

import views.mainMenuOptions.Profile;

import lib.SupportFunctions;
import lib.Mail;
import views.PopupMessage;

/**
 *
 * @author Gustavo
 */
public class ControllerUserProfile implements java.awt.event.ActionListener{
    
    private User                user;
    private Employee            employee;
    private UserDB              userDB;
    private EmployeeDB          employeeDB;
    
    private Profile             profile;
    private PopupMessage        popup;
    
    private SupportFunctions    support;
    private Mail                mail;
    
    private javax.swing.JFrame  parent;
    
    /**
     * Controlador de UserProfile.
     * @param base
     * @param user 
     */
    public ControllerUserProfile(javax.swing.JPanel base, User user) {
        
        this.user = user;
        this.employee = consultUserData(this.user.getEmail());
                
        profile = new Profile();
        
        profile.addEvents(this);
        
        support.cardSelection(base, profile);
        
        if(this.user.getPhoto() != null) {
            
            ImageIcon img = new ImageIcon(this.user.getPhoto().toString());
                    
            Icon photo  = new ImageIcon(img.getImage().getScaledInstance(                          
                    profile.lblProfilePhotoUser.getWidth(), 
                    profile.lblProfilePhotoUser.getHeight(), 
                    Image.SCALE_DEFAULT)
            );

            profile.lblProfilePhotoUser.setText(null);                
            profile.lblProfilePhotoUser.setIcon(photo);
            
        }
                       
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
                        
            int selectedOption = FileChooser.showOpenDialog(parent);
            
            if(selectedOption == javax.swing.JFileChooser.APPROVE_OPTION) {
                
                java.io.File file = FileChooser.getSelectedFile();
                                
                try {
                    
                    ImageIcon img = new ImageIcon(file.toString());
                    
                    Icon photo  = new ImageIcon(img.getImage().getScaledInstance(                          
                            profile.lblProfilePhotoUser.getWidth(), 
                            profile.lblProfilePhotoUser.getHeight(), 
                            Image.SCALE_DEFAULT)
                    );
                    
                    profile.lblProfilePhotoUser.setText(null);
                    profile.lblProfilePhotoUser.setIcon(photo);
                    
                    user.setPhoto(photo);
                    
                    userDB.updatePhoto(user.getEmail(), file);
                                        
                } catch (Exception ex) {
                    
                    System.out.println("Error al abrir el archivo. Error: " + ex);
                    
                    popup = new PopupMessage(parent, true, 10, "Error al abrir el archivo. Error: " + ex);
                    
                }
                             
            }
            
        }
        
        else if(evt.getSource() == profile.btnDeletePhoto) {
            
            profile.lblProfilePhotoUser.setText("Sin imagen");
            profile.lblProfilePhotoUser.setIcon(null);
            
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
