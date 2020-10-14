
package controllers;

// Se importan las models a utilizar.
import models.Employee;
import models.User;
import models.database.EmployeeDB;
import models.database.UserDB;

// Se importan las views a utilizar.
import views.*;

// Se importan los controllers a utilizar.
import controllers.mainMenuOptions.*;

// Se importan las clases de soporte a utilizar.
import lib.SupportFunctions;

// Se importan las librerías a utilizar.
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
import views.mainMenuOptions.Profile;

/**
 * Clase controlador del MainMenu.
 * @author Gustavo
 */
public class ControllerMainMenu implements ActionListener, MouseListener{
    
    // Se declaran las variables a utilizar.
    private MainMenu                mainMenu;
    private SelectOption            select;
    private SupportFunctions        support;
    private User                    user;
    private Employee                employee;
    private UserDB                  userDB;
    private EmployeeDB              employeeDB;
    private ControllerLogin         ctrlLogin;
    private ControllerUserProfile   ctrlProfile;
        
    /**
     * Constructor del controlador del MainMenu.
     * @param user Usuario que ha iniciado sesión.
     */
    public ControllerMainMenu(User user){
        
        // Se instancian las variables a utilzar.
        support             = new SupportFunctions();
        mainMenu            = new MainMenu();
                
        mainMenu.addActionEvents(this);
        mainMenu.addMouseEvents(this);
                
        this.user = user;
        this.employee = consultUserData(this.user.getEmail());
                
        if(this.user.getPhoto() != null) {
                            
            Icon photo  = new ImageIcon(
                    ((ImageIcon) this.user.getPhoto()).getImage().getScaledInstance(                          
                        mainMenu.btnSeeProfile.getWidth(), 
                        mainMenu.btnSeeProfile.getHeight(), 
                        Image.SCALE_DEFAULT
                    )
            );
            
            mainMenu.btnSeeProfile.setIcon(photo);
            
        }
                    
    }

    //<editor-fold defaultstate="collapsed" desc=" Actions ">
    
    @Override
    public void actionPerformed(ActionEvent evt) {
                
        //<editor-fold defaultstate="collapsed" desc=" Botones de la Barra Superior ">
        
        // Minimizar aplicación.
        if(evt.getSource() == mainMenu.btnMin){
            mainMenu.setExtendedState(java.awt.Frame.ICONIFIED);
            mainMenu.btnMin.setBackground(new java.awt.Color(255,245,249));
        } 
        
        // Salir de la aplicación.
        else if(evt.getSource() == mainMenu.btnExit){
            
            select = new SelectOption(
                mainMenu, 
                true, 
                10, 
                "¿Está seguro que desea cerrar la aplicación?",
                null, 
                null
            );
            
            if(select.getOpc())
                System.exit(0);
            
        } 
        
        else if(evt.getSource() == mainMenu.btnSignOff) {
            
            select = new SelectOption(
                mainMenu, 
                true, 
                10, 
                "¿Está seguro que desea cerrar sesión?",
                null, 
                null
            );
            
            if(select.getOpc()) {
                
                mainMenu.btnSignOff.setBackground(new java.awt.Color(255,245,249));
                mainMenu.dispose();
                ctrlLogin = new ControllerLogin();
                
            }
                        
        }
        
        else if(evt.getSource() == mainMenu.btnSeeProfile) {
            
            mainMenu.btnSeeProfile.setBackground(new java.awt.Color(255,245,249));
                        
            ctrlProfile = new ControllerUserProfile(mainMenu.panMainPanel, user);
                                  
        }

        //</editor-fold>
        
        
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
        
    
    
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MouseEvents (no desarrollar) ">
    
    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //</editor-fold>
    
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
