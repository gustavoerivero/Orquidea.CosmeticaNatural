
package controllers;

// Se importan las views a utilizar
import views.Login;
import views.PopupMessage;

// Se importan los models a utilizar
import models.User;
import models.Notification;
import models.database.UserDB;
import models.database.NotificationDB;

// Se importan las clases de soporte.
import lib.SupportFunctions;
import lib.ConnectionDB;
import lib.Mail;

// Se importan las librerías necesarias.
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * 
 * @author Gustavo
 */
public class ControllerLogin implements java.awt.event.ActionListener {
    
    // Se declaran las clases a utilizar.
    
        // Views
        private Login                   login;
        private PopupMessage            popup;
        
        // Models
        private User                    user;
        private UserDB                  userDB;
        private Notification            notification;
        private NotificationDB          notificationDB;
        
        // Controllers
        private ControllerForgotPass    ctrlForgot;
        private ControllerWelcomeForm   ctrlWelcome;
        private ControllerMainMenu      ctrlMainMenu;
    
        
    // Se declaran clases de soporte.
    private SupportFunctions            support;
    private ConnectionDB                con;
    private Mail                        mail;
        
    // Constructor del Login
    public ControllerLogin(){
        
        support         = new SupportFunctions();
        userDB          = new UserDB();
        notificationDB  = new NotificationDB();
        con             = new ConnectionDB();
        mail            = new Mail("caelestidevelopment@gmail.com", "tavo9712pipox");
                
        login           = new Login();
        
        // Se añaden los eventos.
        login.addEvents(this);
        
        // Si no existen registros en la tabla 'User'.
        if(!con.dataExist("Enterprise")) {
            ctrlWelcome = new ControllerWelcomeForm();
            login.dispose();
        }
            
    }
    
    /**
     * Se describen los eventos provocados por las acciones de los botones.
     * @param evt parámetro que corresponde a la acción de los botónes.
     */
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt){
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la Barra Superior ">
        
        // Minimizar aplicación.
        if(evt.getSource() == login.btnMin){
            login.setExtendedState(java.awt.Frame.ICONIFIED);
            login.btnMin.setBackground(new java.awt.Color(255,245,249));
        } 
        
        // Salir de la aplicación.
        else if(evt.getSource() == login.btnExit){
            System.exit(0);
        } 

        //</editor-fold>
        
        // Botón limpiar; retorna los campos a sus valores iniciales.
        else if(evt.getSource() == login.btnClear){
            
            login.txtEmailField.setText("Ingrese su correo electrónico");
            login.pssPasswordField.setText("Ingrese su contraseña");
            login.tgbShowPass.setSelected(false);
            login.pssPasswordField.setEchoChar('*');
            
        }
        
        // Botón para ingresar al sistema.
        else if(evt.getSource() == login.btnOk){
                             
            // Se obtienen los datos de tipo String.
            String  email   = login.txtEmailField.getText(),
                    pass    = new String(login.pssPasswordField.getPassword());
            
            // Si el contenido de los campos es igual a vacío o el mensaje predeterminado.
            if((email.isEmpty() || email.equals("Ingrese su correo electrónico")) || ( 
                pass.isEmpty() || pass.equals("Ingrese su contraseña"))){
                
                // Se muestra un mensaje emergente de "Datos faltantes".
                popup = new PopupMessage(login, true, 6, 
                        "Debe ingresar los datos correspondientes.");
                
            // Si todo está correcto, se accede al sistema.
            } else{
                                
                // Se verifica el formato del correo ingresado.
                if(support.verifyEmail(email) && 
                        support.verifyPassword(login.pssPasswordField.getPassword(), 8, 16, 0)){
                    
                    // Si el usuario y la contraseña son correctos.
                    if(userDB.signer(email, pass)){
                        
                        // Se muestra quién ingresó al sistema.
                        System.out.println("El usuario '" + email + "' ha ingresado al"
                                + " sistema con la contraseña '" + pass + "'.");

                        // Se muestra un mensaje emergente de "Bienvenido".
                        popup = new PopupMessage(login, true, 2, "Bienvenido");
                                
                        user = getDataAccess(email);
                        
                        notification = new Notification(new ConnectionDB().next("Notification"),
                                "Inicio de sesión " + new Date(), 
                                "El usuario " + email + " ha iniciado sesión el "
                                        + new Date() + " en el gestor \"Caelesti Management\". "
                                        + "\n\nSi usted desconoce de esta actividad "
                                        + "póngase en contacto inmediatamente con el "
                                        + "administrador del sistema.",
                                'A',
                                0,
                                'A'
                        );
                        
                        notificationDB.createAndLinkNotification(user.getId(), notification);
                        
                        // Se notifica al usuario vía correo que ha iniciado sesión en la aplicación.
                        mail.sendMessage(
                                email, 
                                notification.getName(), 
                                notification.getMessage()
                        );      
                        
                        System.out.println("Los datos de acceso del usuario son: " +
                                "Tipo: " + user.getUserTypeId() +
                                ". Correo: " + user.getEmail() +
                                ". Contraseña: " + user.getPassword()
                        );
                        
                        // Se actualizan los datos de fechas sobre el inicio de sesión.
                        userDB.changeDateUser(email);
                        
                        // Se oculta la view de Login.
                        login.dispose();
                        
                        // Se instancia el Controlador de MainMenu.
                        ctrlMainMenu = new ControllerMainMenu(user);

                    } else {
                    
                        // Se muestra un mensaje emergente de "Datos faltantes".
                        popup = new PopupMessage(login, true, 6, 
                                "El correo electrónico o la contraseña son "
                                        + "incorrectos.");
                        
                        if(userDB.userExist(email, 'A')) {
                            
                            notification = new Notification(new ConnectionDB().next("Notification"),
                                    "Inicio de sesión " + new Date() + " fallido.", 
                                    "Hubo un intento de inicio de sesión el " + new Date() + ""
                                            + " en el gestor \"Caelesti Management\". \n\nSi "
                                            + "desconoce esta actividad pónganse en"
                                            + "contacto inmediatamente con el administrador"
                                            + " del sistema.",
                                    'A',
                                    0,
                                    'A'
                            );

                            notificationDB.createAndLinkNotification(getDataAccess(email).getId(), notification);

                            // Se notifica al usuario vía correo que ha iniciado sesión en la aplicación.
                            mail.sendMessage(
                                    email, 
                                    notification.getName(), 
                                    notification.getMessage()
                            );      
                            
                        }
                        
                        System.out.println("Inicio de sesión fallido. "
                                + "Error: Correo electrónico o contraseña incorrectos.");
                        
                    }
                    
                } else {
                    
                    popup = new PopupMessage(login, true, 6, 
                            "El correo electrónico o la contraseña no tienen un "
                                    + "formato válido.");
                    
                    System.out.println("Inicio de sesión fallido. "
                            + "Error: Correo electrónico o contraseña no válidos.");
                
                }
                    
            }
            
        }
        
        // ToggleButton para visualizar el campo de contraseña o ocultarlo (Según el caso).
        else if(evt.getSource() == login.tgbShowPass){
            
            // Si el toggleButton es seleccionado la contraseña será visible.
            if(login.tgbShowPass.isSelected())
                login.pssPasswordField.setEchoChar((char) 0);
            
            // Caso contrario; Si se deselecciona el toggleButton, se oculta la contraseña.
            else 
                login.pssPasswordField.setEchoChar('*');
        }
        
        // Si se ha olvidado la contraseña.
        else if(evt.getSource() == login.btnForgotPass){
            
            // Se instancia la clase para recuperar contraseña.
            ctrlForgot = new ControllerForgotPass();
            
        }
        
    }
     
    /**
     * Método para obtener los datos de acceso de un usuario.
     * @param email Correo electrónico del usuario que va a ingresar al sistema.
     */
    private User getDataAccess(String email) {
        
        // Se instancia la clase a utilizar.
        userDB = new UserDB();
        
        User supportUser = null;
                        
        try {
            
            java.sql.ResultSet result = userDB.getDataAccess(email);
                        
            while(result.next()){
                supportUser = new User(
                        result.getInt("id"), 
                        result.getInt("UserTypeid"), 
                        result.getString("email"), 
                        result.getString("password"),
                        result.getString("rememberData").charAt(0),
                        result.getString("state").charAt(0),
                        result.getDate("firstSession"),
                        result.getDate("lastSession"), 
                        null
                );
                
                java.io.InputStream is = result.getBinaryStream("photo");
                
                if(is != null)
                    supportUser.setPhoto(new ImageIcon((java.awt.image.BufferedImage) (ImageIO.read(is))));
                               
            }
                                                
            System.out.println("Éxito.");
            
            return supportUser;
                                    
        } catch (java.sql.SQLException | java.io.IOException e) {
            System.out.println("Error: " + e);
        }
        
        return null;
        
    }
    
}
