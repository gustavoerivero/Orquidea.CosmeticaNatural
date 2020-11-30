
package controllers;

// Se importan las librerías de apoyo.
import lib.SupportFunctions;
import lib.Mail;

// Se importan los models a utilizar.
import models.Notification;

import models.database.UserDB;
import models.database.NotificationDB;

// Se importan las views a utilizar.
import views.ForgotPass;
import views.PopupMessage;
import views.SelectOption;

/**
 * 
 * @author Gustavo
 */
public class ControllerForgotPass implements java.awt.event.ActionListener{
    
    // Se declaran las clases a utilizar.
        // Views
        private ForgotPass          forgot;
        private PopupMessage        popup;
        private SelectOption        select;
        
        // Librerías de soporte
        private SupportFunctions    support;
        private Mail                mail;
        
        // Models
        private Notification        notification;
        private NotificationDB      notificationDB;
        private UserDB              userDB;
    
    // Se declaran las variables a utilizar.
    private String correo, codex;
    
    public ControllerForgotPass(){
    
        // Se instancia clase de soporte.
        support         = new SupportFunctions();
        notificationDB  = new NotificationDB();
        userDB          = new UserDB();
        mail            = new Mail("caelestidevelopment@gmail.com", "tavo9712pipox");
        
        // Se instancia view a utilizar.
        forgot          = new ForgotPass();
        
        // Se activan los eventos de los botones.
        forgot.addEvents(this);
        
        // Se inicializan las variables.
        correo          = null;
        codex           = null;
                
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt){
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la Barra Superior ">
        
        // Minimizar aplicación.
        if(evt.getSource() == forgot.btnMin){
            forgot.setExtendedState(java.awt.Frame.ICONIFIED);
            forgot.btnMin.setBackground(new java.awt.Color(255,245,249));
        } 
        
        // Salir de la aplicación.
        else if(evt.getSource() == forgot.btnExit){
            forgot.dispose();
        } 

        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" First Step ">
        
        // Botón limpiar; retorna los campos a sus valores iniciales.
        else if(evt.getSource() == forgot.btnClear1){
            
            forgot.txtEmailField.setText("Ingrese su correo electrónico");
            forgot.txtEmailField1.setText("Ingrese nuevamente su correo electrónico");
            
        }
        
        // Botón Aceptar; Correo electrónico
        else if(evt.getSource() == forgot.btnOk){
            
            String  email               = forgot.txtEmailField.getText(),
                    emailConfirmation   = forgot.txtEmailField1.getText();
            
            // Si no se proporcionaron los datos solicitados.
            if((email.isEmpty() ^ emailConfirmation.isEmpty()) ^ 
                    ((email.equals("Ingrese su correo electrónico") ^ 
                    emailConfirmation.equals("Ingrese nuevamente su correo electrónico")))){
                
                popup = new PopupMessage(forgot, true, 6, "Debe ingresar los "
                        + "datos solicitados.");
                
            }
            
            // Si se proporcionaron los datos solicitados.
            else {
            
                // Si ambos correos electrónicos tienen formato válido.
                if(support.verifyEmail(email) && support.verifyEmail(emailConfirmation)){
                    
                    // Si los correos electrónicos son iguales y existe el usuario.
                    if(email.equals(emailConfirmation) && userDB.signer(email)){
                
                        correo = email;

                        System.out.println("El correo con código de confirmación está"
                                + " siendo preparado.");

                        // Obtener el código de confirmación.
                        codex = support.randomCharacterString('1', 6);
                            
                        // Se procede a enviar el mensaje con el código de verificación.
                        if(mail.sendMessage(
                                correo, 
                                "Código de confirmación para recuperar contraseña", 
                                "El código de confirmación para poder recuperar "
                                        + "tu contraseña es: " + codex)) {
                            
                            popup = new PopupMessage(forgot, true, 15, "El correo con el "
                                + "código de verificación ha sido enviado");
                            
                            // Se cambia la pantalla.
                            support.cardSelection(forgot.panContent, forgot.panStepTwo);
                            
                        } else
                            
                            popup = new PopupMessage(forgot, true, 10, "El correo con el "
                                + "código de verificación no pudo ser enviado, "
                                    + "verifique los datos ingresados");
                                                  
                    } else {
                        
                        // Si los correos proporcionados no son iguales.
                        if(!email.equals(emailConfirmation))
                            popup = new PopupMessage(forgot, true, 6, "Los correos "
                                    + "electrónicos no son iguales.");
                        
                        // Si el usuario no está registrado
                        else
                            popup = new PopupMessage(forgot, true, 6, "El usuario "
                                    + "no está registrado.");

                    }
                    
                } else {
                    
                    // Se muestra un mensaje emergente de "Datos faltantes".
                    popup = new PopupMessage(forgot, true, 6, 
                            "El correo electrónico no tiene un formato válido.");
                    
                }
                    
            }
                
        }
        
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Second Step ">
        
        // Volver al paso anterior.
        else if(evt.getSource() == forgot.btnBackStepOne){
            
            select = new SelectOption(forgot, true, 10,
                    "¿Está seguro que desea volver al paso anterior?", null, null);
            
            if(select.getOpc() == true)
                support.cardSelection(forgot.panContent, forgot.panStepOne);
            
        }
        
        else if(evt.getSource() == forgot.btnOk1){
            
            if(forgot.txtEmailField2.getText().isEmpty() ^ 
                    forgot.txtEmailField2.getText().equals("Ingresa código de "
                            + "verificación"))
                popup = new PopupMessage(forgot, true, 6, "Ingrese el código de "
                        + "confirmación");
            
            else if (!forgot.txtEmailField2.getText().equals(codex))
                popup = new PopupMessage(forgot, true, 6, "El código de "
                        + "confirmación es incorrecto.");
            
            else 
                support.cardSelection(forgot.panContent, forgot.panStepThree);
                           
        }
        
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Third Step ">
        
        // Se limpian los campos.
        else if (evt.getSource() == forgot.btnClear2){
            
            forgot.pssPasswordField.setText("Ingrese su nueva contraseña");
            forgot.pssPasswordField1.setText("Ingrese su nueva contraseña");
            forgot.tgbShowPass.setSelected(false);
            forgot.pssPasswordField.setEchoChar('*');
            
        }
        
        // ToggleButton para visualizar el campo de contraseña o ocultarlo (Según el caso).
        else if(evt.getSource() == forgot.tgbShowPass){
            
            // Si el toggleButton es seleccionado la contraseña será visible.
            if(forgot.tgbShowPass.isSelected())
                forgot.pssPasswordField.setEchoChar((char) 0);
            
            // Caso contrario; Si se deselecciona el toggleButton, se oculta la contraseña.
            else 
                forgot.pssPasswordField.setEchoChar('*');
            
        }
        
        // Para actualizar las contraseñas.
        else if(evt.getSource() == forgot.btnOk2){
               
            String  pass                = new String(forgot.pssPasswordField.getPassword()),
                    passConfirmation    = new String(forgot.pssPasswordField1.getPassword());
            
            // Se muestra en consola las contraseñas ingresadas.
            System.out.println("La primera contraseña es: " + pass + " mientras"
                    + " que la segunda es: " + passConfirmation);
            
            // Se comprueba de que las contraseñas sean iguales.
            if(support.isPasswordCorrect(forgot.pssPasswordField.getPassword(), 
                    forgot.pssPasswordField1.getPassword())){
                
                int min = 8, max = 16;
                
                if(support.verifyPassword(forgot.pssPasswordField.getPassword(), min, max, 0)) {
                    
                    // Se muestra el aviso de que las contraseñas son iguales.
                    System.out.println("Contraseñas iguales. Se procede a actualizar.");

                    // Se actualiza la contraseña.
                    userDB.insertNewPass(correo, pass);

                    // Se muestra mensaje de que la actualización fue exitosa.
                    System.out.println("Al usuario " + correo + " se le ha actualizado "
                            + "su contraseña por " + pass + ".");
                    
                    notification = new Notification(new lib.ConnectionDB().next("Notification"),
                            "Cambio de contraseña " + new java.util.Date(), 
                            "El usuario " + correo + " ha cambiado de contraseña el "
                                    + new java.util.Date() + " en el gestor \"Caelesti Management\"."
                                    + " La nueva contraseña es " + pass
                                    + "\n\nSi usted desconoce de esta actividad "
                                    + "póngase en contacto inmediatamente con el "
                                    + "administrador del sistema.",
                            'A',
                            0,
                            'A'
                    );
                    
                    notificationDB.createAndLinkNotification(userDB.getId(correo), notification);

                    mail.sendMessage(
                            correo, 
                            notification.getName(), 
                            notification.getMessage()
                    );   

                    // Se muestra en pantalla mensaje de que la actualización fue exitosa.
                    popup = new PopupMessage(forgot, true, 15, 
                            "La contraseña ha sido actualizada.");

                    // Se cierra pantalla.
                    forgot.dispose();
                    
                } else {
                                        
                    if(pass.length() < min)
                        popup = new PopupMessage(forgot, true, 6, 
                                "La longitud mínima de la contraseña debe ser de " 
                                        + min + " caracteres."
                        );
                    else if(pass.length() > max)
                        popup = new PopupMessage(forgot, true, 6, 
                                "La longitud máxima de la contraseña debe ser de " +
                                        max + " caracteres."
                        );
                    else 
                        popup = new PopupMessage(forgot, true, 6, 
                                "Verifique que su contraseña tenga al menos "
                                        + "una letra minúscula, una letra mayúscula,"
                                        + " un número y un caracter especial "
                                        + "(_ * . / & % -)."
                        );
                    
                }
                
            } else if((pass.equals("Ingrese su nueva contraseña") ^ 
                    pass.equals("Ingrese su nueva contraseña")) ^ (
                    pass.isEmpty() ^ pass.isEmpty()))
                popup = new PopupMessage(forgot, true, 6, 
                        "Debe ingresar una nueva contraseña.");
              
            else
                popup = new PopupMessage(forgot, true, 6, 
                        "Las contraseñas no son iguales.");
                
        }
        
        //</editor-fold>
        
    }
        
}
