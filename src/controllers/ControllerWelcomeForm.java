
package controllers;

// Se importan las views a utilizar
import views.WelcomeForm;
import views.PopupMessage;
import views.SelectOption;

// Se importan los models a utilizar
import models.Employee;
import models.User;
import models.Enterprise;
import models.database.EnterpriseDB;
import models.database.UserDB;
import models.database.EmployeeDB;

// Se importan las clases de soporte.
import lib.SupportFunctions;
import lib.Mail;

// Se importan las librerías necesarias.
import java.util.Calendar;
import java.util.Date;
import java.io.File;
import javax.swing.Icon;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Gustavo
 */
public class ControllerWelcomeForm implements java.awt.event.ActionListener{

    //<editor-fold defaultstate="collapsed" desc=" Clases y variables declaradas ">
    
    // Se declaran las clases a utilizar.
    
        // Views
        private WelcomeForm     welcome;
        private PopupMessage    popup;
        private SelectOption    select;
        
        // Models
        private UserDB          userDB          = new UserDB();
        private EmployeeDB      employeeDB      = new EmployeeDB();
        private EnterpriseDB    enterpriseDB    = new EnterpriseDB();
        
        // Controllers
        private ControllerLogin ctrlLogin;
        
    // Clase de soporte
    private SupportFunctions    support;
    private Mail                mail;
    
    private String  dniEnterprise,
                    nameEnterprise,
                    descriptionEnterprise,
                    directionEnterprise,
                    emailEnterprise,
                    dni,
                    name,
                    surname,
                    direction,
                    email,
                    password,
                    codex;
    
    private long    phoneEnterprise,
                    phone;
    
    private Date    birthday;
    
    private Icon    photo;
    
    private File    file;
    
    //</editor-fold>
    
    public ControllerWelcomeForm() {
        
        // Se instancian las clases de soporte.
        support = new SupportFunctions();
        mail    = new Mail(
                "caelestidevelopment@gmail.com", 
                "tavo9712pipox"
        );
                
        // Se instancia la view de Login.
        welcome = new WelcomeForm();
        
        // Se añaden los eventos.
        welcome.addEvents(this);
                
    }
    
        @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la Barra Superior ">
        // Minimizar aplicación.
        if(evt.getSource() == welcome.btnMin){
            welcome.setExtendedState(java.awt.Frame.ICONIFIED);
            welcome.btnMin.setBackground(new java.awt.Color(255,245,249));
        } 
        
        // Salir de la aplicación.
        else if(evt.getSource() == welcome.btnExit){
            System.exit(0);
        } 
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botón de bienvenida ">
        else if(evt.getSource() == welcome.btnWelcome) {
            
            welcome.panBtnWelcome.setBackground(new java.awt.Color(254,220,234));
            welcome.btnWelcome.setForeground(new java.awt.Color(0, 0, 0));
            welcome.btnWelcome.setBackground(new java.awt.Color(254,220,234));
            
            support.cardSelection(welcome.panCard, welcome.panEnterpriseOp);
            
            welcome.lblWelcome.setForeground(new java.awt.Color(0, 0, 0));
            welcome.panWelcome.setBackground(new java.awt.Color(255,230,240));
            
            welcome.panEnterpriseInfo.setBackground(new java.awt.Color(194, 48, 111));
            welcome.lblEnterprise.setForeground(new java.awt.Color(255,230,240));
            
            popup = new PopupMessage(welcome, true, 12, "Ingresa la información que se solicita sobre tu empresa.");
            
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la sección de Empresa ">
        else if(evt.getSource() == welcome.btnClearEnterprise) {
            
            welcome.txtEnterpriseName.setText("Orquídea. Cosmética Natural");
            welcome.txtEnterpriseCode.setText("Ingresa el código de la empresa");
            welcome.txtEnterpriseDescription.setText("Ingresa la descripción de la empresa");
            welcome.txtEnterpriseDirection.setText("Ingresa la dirección de la empresa");
            welcome.txtEnterprisePhone.setText("Ingresa el número telefónico de la empresa");
            welcome.txtEnterpriseEmail.setText("Ingresa el correo electrónico de la empresa");
            
        }
        
        else if(evt.getSource() == welcome.btnDataUser) {
            
            if (!welcome.txtEnterpriseCode.getText().equals("Ingresa el código de la empresa") &&
                    !welcome.txtEnterpriseCode.getText().isEmpty() && 
                    !welcome.txtEnterpriseDescription.getText().equals("Ingresa la descripción de la empresa") &&
                    !welcome.txtEnterpriseDescription.getText().isEmpty() &&
                    !welcome.txtEnterpriseDirection.getText().equals("Ingresa la dirección de la empresa") && 
                    !welcome.txtEnterpriseDirection.getText().isEmpty() &&
                    !welcome.txtEnterprisePhone.getText().equals("Ingresa el número telefónico de la empresa") &&
                    !welcome.txtEnterprisePhone.getText().isEmpty() && welcome.txtEnterprisePhone.getText().length() >= 10 &&
                    !welcome.txtEnterpriseEmail.getText().equals("Ingresa el correo electrónico de la empresa") &&
                    !welcome.txtEnterpriseEmail.getText().isEmpty() && 
                    support.verifyEmail(welcome.txtEnterpriseEmail.getText())) {
                
                welcome.panBtnDataUser.setBackground(new java.awt.Color(254,220,234));
                welcome.btnDataUser.setForeground(new java.awt.Color(0, 0, 0));
                welcome.btnDataUser.setBackground(new java.awt.Color(254,220,234));
                
                dniEnterprise = welcome.txtEnterpriseCode.getText();
                nameEnterprise = welcome.txtEnterpriseName.getText();
                descriptionEnterprise = welcome.txtEnterpriseDescription.getText();
                directionEnterprise = welcome.txtEnterpriseDirection.getText();
                phoneEnterprise = Long.valueOf(welcome.txtEnterprisePhone.getText());
                emailEnterprise = welcome.txtEnterpriseEmail.getText();
                                
                support.cardSelection(welcome.panCard, welcome.panDataOp);
                
                welcome.dtcUserBirthday.setDate(new Date());

                welcome.lblEnterprise.setForeground(new java.awt.Color(0, 0, 0));
                welcome.panEnterpriseInfo.setBackground(new java.awt.Color(255,230,240));

                welcome.panData.setBackground(new java.awt.Color(194, 48, 111));
                welcome.lblData.setForeground(new java.awt.Color(255,230,240));

                popup = new PopupMessage(welcome, true, 12, "Ingresa la información que se solicita sobre ti.");
                
            } else 
                popup = new PopupMessage(welcome, true, 6, "Ingrese toda la información solicitada en el formulario.");
                            
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la sección de datos del usuario ">
        else if(evt.getSource() == welcome.btnBackEnterprise) {
            
            welcome.panBtnBackEnterprise.setBackground(new java.awt.Color(254,220,234));
            welcome.btnBackEnterprise.setForeground(new java.awt.Color(0, 0, 0));
            welcome.btnBackEnterprise.setBackground(new java.awt.Color(254,220,234));
                        
            welcome.panEnterpriseInfo.setBackground(new java.awt.Color(194, 48, 111));
            welcome.lblEnterprise.setForeground(new java.awt.Color(255,230,240));
            
            welcome.lblData.setForeground(new java.awt.Color(0, 0, 0));
            welcome.panData.setBackground(new java.awt.Color(255,230,240));
            
            support.cardSelection(welcome.panCard, welcome.panEnterpriseOp);
                        
        }
        
        else if(evt.getSource() == welcome.btnClearUser) {
            
            welcome.txtUserDNI.setText("Ingresa tu documento de identificación");
            welcome.txtUserName.setText("Ingresa tu nombre");
            welcome.txtUserSurname.setText("Ingresa tu apellido");
            welcome.txtUserDirection.setText("Ingresa tu dirección");
            welcome.txtUserPhone.setText("Ingresa tu número telefónico");
            welcome.dtcUserBirthday.setDate(new Date());
            
        }
        
        else if(evt.getSource() == welcome.btnAccountUser) {
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(welcome.dtcUserBirthday.getDate());
            calendar.add(Calendar.YEAR, 18);
            Date val = calendar.getTime(), date = new Date();
                        
            try {
                
                if (!welcome.txtUserDNI.getText().equals("Ingresa tu documento de identificación") &&
                        !welcome.txtUserDNI.getText().isEmpty() &&
                        !welcome.txtUserName.getText().equals("Ingresa tu nombre") &&
                        !welcome.txtUserName.getText().isEmpty() &&
                        !welcome.txtUserSurname.getText().equals("Ingresa tu apellido") &&
                        !welcome.txtUserSurname.getText().isEmpty() &&
                        !welcome.txtUserPhone.getText().equals("Ingresa tu número telefónico") &&
                        !welcome.txtUserPhone.getText().isEmpty() && welcome.txtUserPhone.getText().length() >= 10 &&
                        !welcome.txtUserDirection.getText().equals("Ingresa tu dirección") &&
                        !welcome.txtUserDirection.getText().isEmpty() &&
                        (val.before(date) || val.equals(date)) && 
                        !employeeDB.consultOneEmployeeFromDNI(dni).next()) {
                    
                    welcome.panBtnAccountUser.setBackground(new java.awt.Color(254,220,234));
                    welcome.btnAccountUser.setForeground(new java.awt.Color(0, 0, 0));
                    welcome.btnAccountUser.setBackground(new java.awt.Color(254,220,234));
                    
                    dni = welcome.txtUserDNI.getText();
                    name = welcome.txtUserName.getText();
                    surname = welcome.txtUserSurname.getText();
                    phone = Long.valueOf(welcome.txtUserPhone.getText());
                    birthday = welcome.dtcUserBirthday.getDate();
                    direction = welcome.txtUserDirection.getText();
                    
                    support.cardSelection(welcome.panCard, welcome.panDataUserOp);
                    
                    welcome.lblData.setForeground(new java.awt.Color(0, 0, 0));
                    welcome.panData.setBackground(new java.awt.Color(255,230,240));
                    
                    welcome.panDataUser.setBackground(new java.awt.Color(194, 48, 111));
                    welcome.lblDataUser.setForeground(new java.awt.Color(255,230,240));
                    
                    popup = new PopupMessage(welcome, true, 12, "Ingresa la información solicitada sobre la cuenta de usuario.");
                    
                } else {
                    
                    if (val.after(date))
                        popup = new PopupMessage(welcome, true, 6, "La fecha de nacimiento pertenece a un menor de edad.");
                    else
                        popup = new PopupMessage(welcome, true, 6, "Ingrese toda la información solicitada en el formulario.");
                    
                }
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            }
            
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la sección de la cuenta de usuario ">
        else if(evt.getSource() == welcome.btnSearchPhotoUser) {
                   
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
                        
            int selectedOption = FileChooser.showOpenDialog(welcome);
            
            if(selectedOption == javax.swing.JFileChooser.APPROVE_OPTION) {
                
                file = FileChooser.getSelectedFile();
                
                welcome.txtPhotoPath.setText(file.getAbsolutePath());
                
                try {
                    
                    ImageIcon img = new ImageIcon(file.toString());
                    
                    photo  = new ImageIcon(img.getImage().getScaledInstance(                          
                            welcome.lblPhoto.getWidth(), 
                            welcome.lblPhoto.getHeight(), 
                            Image.SCALE_DEFAULT)
                    );
                    
                    welcome.lblPhoto.setText(null);                
                    welcome.lblPhoto.setIcon(photo);
                    
                } catch (Exception ex) {
                    
                    System.out.println("Error al abrir el archivo. Error: " + ex);
                    
                    popup = new PopupMessage(welcome, true, 10, "Error al abrir el archivo. Error: " + ex);
                    
                }
                             
            }
            
        }
        
        else if(evt.getSource() == welcome.btnDeletePhotoUser) {
            
            photo = null;
            
            welcome.txtPhotoPath.setText("Ruta de la imagen");
            welcome.lblPhoto.setIcon(photo);
            welcome.lblPhoto.setText("Sin imagen");
                        
        }
        
        else if(evt.getSource() == welcome.btnBackUserData) {
            
            welcome.panBtnBackUserData.setBackground(new java.awt.Color(254,220,234));
            welcome.btnBackUserData.setForeground(new java.awt.Color(0, 0, 0));
            welcome.btnBackUserData.setBackground(new java.awt.Color(254,220,234));
                        
            welcome.panData.setBackground(new java.awt.Color(194, 48, 111));
            welcome.lblData.setForeground(new java.awt.Color(255,230,240));
            
            welcome.lblDataUser.setForeground(new java.awt.Color(0, 0, 0));
            welcome.panDataUser.setBackground(new java.awt.Color(255,230,240));
            
            support.cardSelection(welcome.panCard, welcome.panDataOp);
                                    
        }
        
        else if(evt.getSource() == welcome.btnClearAccountUser) {
            
            photo = null;
            
            welcome.txtPhotoPath.setText("Ruta de la imagen");
            welcome.lblPhoto.setIcon(photo);
            welcome.lblPhoto.setText("Sin imagen");
            
            welcome.txtUserEmail.setText("Ingresa tu correo electrónico");
            welcome.txtUserConfirmEmail.setText("Ingresa nuevamente tu correo electrónico");
            welcome.pssUser.setText("Ingresa tu contraseña");
            welcome.pssUserConfirm.setText("Ingresa tu contraseña");
            
            welcome.tgbShowPass.setSelected(false);
            welcome.pssUser.setEchoChar('*');
            
            welcome.tgbShowPass1.setSelected(false);
            welcome.pssUserConfirm.setEchoChar('*');
            
        }
        
        else if(evt.getSource() == welcome.tgbShowPass) {
            
            // Si el toggleButton es seleccionado la contraseña será visible.
            if(welcome.tgbShowPass.isSelected())
                welcome.pssUser.setEchoChar((char) 0);
            
            // Caso contrario; Si se deselecciona el toggleButton, se oculta la contraseña.
            else 
                welcome.pssUser.setEchoChar('*');
            
        }
        
        else if(evt.getSource() == welcome.tgbShowPass1) {
            
            // Si el toggleButton es seleccionado la contraseña será visible.
            if(welcome.tgbShowPass1.isSelected())
                welcome.pssUserConfirm.setEchoChar((char) 0);
            
            // Caso contrario; Si se deselecciona el toggleButton, se oculta la contraseña.
            else 
                welcome.pssUserConfirm.setEchoChar('*');
            
        }
        
        else if(evt.getSource() == welcome.btnConfirmUser) {
                        
            String  pass        = new String(welcome.pssUser.getPassword()), 
                    confPass    = new String(welcome.pssUserConfirm.getPassword());
            
            if (!welcome.txtUserEmail.getText().equals("Ingresa tu correo electrónico") &&
                    !welcome.txtUserEmail.getText().isEmpty() && 
                    !welcome.txtUserConfirmEmail.getText().equals("Ingresa nuevamente tu correo electrónico") &&
                    !welcome.txtUserConfirmEmail.getText().isEmpty() && 
                    !pass.isEmpty() && !pass.equals("Ingrese su contraseña") && 
                    !confPass.isEmpty() && !confPass.equals("Ingrese su contraseña") &&
                    support.verifyEmail(welcome.txtUserEmail.getText()) &&
                    support.verifyEmail(welcome.txtUserConfirmEmail.getText())) {
                
                if(welcome.txtUserEmail.getText().equals(welcome.txtUserConfirmEmail.getText())) {
                    
                    if(support.isPasswordCorrect(welcome.pssUser.getPassword(), 
                            welcome.pssUserConfirm.getPassword())) {
                        
                        int min = 8, max = 16;
                        
                        if(support.verifyPassword(welcome.pssUser.getPassword(), min, max, 0)) {
                            
                            welcome.panBtnConfirmUser.setBackground(new java.awt.Color(254,220,234));
                            welcome.btnConfirmUser.setForeground(new java.awt.Color(0, 0, 0));
                            welcome.btnConfirmUser.setBackground(new java.awt.Color(254,220,234));

                            email = welcome.txtUserEmail.getText();
                            password = pass;
                            photo = welcome.lblPhoto.getIcon();

                            support.cardSelection(welcome.panCard, welcome.panConfirmOp);

                            // Obtener el código de confirmación.
                            codex = support.randomCharacterString('1', 6);

                            System.out.println("El código de verificación " + codex +
                                    " ha sido enviado al correo '" + email + "' con éxito.");

                            if(mail.sendMessage(email, 
                                    "Código de Verificación: Registro \"Orquídea. Cosmética Natural\"", 
                                    "Ya estamos por culminar el registro, para ello necesitaremos que "
                                            + "ingreses el código de verificación " + codex + " en la "
                                                    + "aplicación y tendremos la información necesaria "
                                                    + "para preparar el entorno para ti."))

                            popup = new PopupMessage(welcome, true, 15, "El correo con el "
                                    + "código de verificación ha sido enviado");

                            else                            
                                popup = new PopupMessage(welcome, true, 10, "El correo con el "
                                    + "código de verificación no pudo ser enviado, "
                                        + "verifique los datos ingresados y/o su conexión a internet.");

                            welcome.lblDataUser.setForeground(new java.awt.Color(0, 0, 0));
                            welcome.panDataUser.setBackground(new java.awt.Color(255,230,240));

                            welcome.panDataConfirm.setBackground(new java.awt.Color(194, 48, 111));
                            welcome.lblDataConfirm.setForeground(new java.awt.Color(255,230,240));

                            popup = new PopupMessage(welcome, true, 12, "Ingresa los datos solicitados en el formulario "
                                    + "para completar el registro."); 
                            
                        } else {
                            
                            if(welcome.pssUser.getPassword().length < min)
                                popup = new PopupMessage(welcome, true, 6, 
                                        "La contraseña debe tener una longitud mínima de " + min + " caracteres.");
                            else if(welcome.pssUser.getPassword().length > max)
                                popup = new PopupMessage(welcome, true, 6, 
                                        "La contraseña debe tener una longitud máxima de " + max + " caracteres.");
                            else
                                popup = new PopupMessage(welcome, true, 6, "Verifique que su contraseña tenga al menos "
                                        + "una letra minúscula, una letra mayúscula, un número y un caracter especial "
                                        + "(_ * . / & % -).");
                            
                        }
                               
                    } else
                        popup = new PopupMessage(welcome, true, 6, "Las contraseñas ingresadas no son iguales.");
                    
                } else
                    popup = new PopupMessage(welcome, true, 6, "Los correos electrónicos ingresados no son iguales.");
                
            } else 
                popup = new PopupMessage(welcome, true, 6, "Ingrese toda la información solicitada en el formulario.");
                            
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de la sección de confirmación de usuario ">
        else if(evt.getSource() == welcome.btnBackUser) {
            
            welcome.panBtnBackUser.setBackground(new java.awt.Color(254,220,234));
            welcome.btnBackUser.setForeground(new java.awt.Color(0, 0, 0));
            welcome.btnBackUser.setBackground(new java.awt.Color(254,220,234));
                        
            welcome.lblDataUser.setBackground(new java.awt.Color(194, 48, 111));
            welcome.panDataUser.setForeground(new java.awt.Color(255,230,240));
            
            welcome.lblDataConfirm.setForeground(new java.awt.Color(0, 0, 0));
            welcome.panDataConfirm.setBackground(new java.awt.Color(255,230,240));
            
            support.cardSelection(welcome.panCard, welcome.panDataUserOp);
            
        }
        
        else if(evt.getSource() == welcome.btnClearConfirm) {
            
            welcome.txtEmailConfirm.setText("Ingresa tu correo electrónico");
            welcome.txtCodeConfirm.setText("Ingresa el código de verificación");
            
        }
        
        else if(evt.getSource() == welcome.btnReady) {
            
            if(welcome.txtEmailConfirm.getText().equals(email)) {
                
                if(welcome.txtCodeConfirm.getText().equals(codex)) {
                    
                    select = new SelectOption(
                            welcome, 
                            true, 
                            10, 
                            "¿Está seguro de registrar la información "
                                    + "suministrada en la aplicación?",
                            null, 
                            null
                    );
                    
                    if(select.getOpc()) {
                        
                      enterpriseDB.registerEnterprise(
                            new Enterprise(
                                    0, 
                                    dniEnterprise, 
                                    nameEnterprise, 
                                    descriptionEnterprise,
                                    directionEnterprise,
                                    emailEnterprise, 
                                    phoneEnterprise, 
                                    'A'
                            )
                        );

                        userDB.registerUser(
                                new User(
                                        0, 
                                        0, 
                                        email, 
                                        password, 
                                        'A', 
                                        'A',
                                        null, 
                                        null,
                                        photo
                                )
                        );

                        if(photo != null)
                            userDB.updatePhoto(0, file);

                        employeeDB.registerEmployee(
                                new Employee(
                                        0,
                                        0,
                                        name,
                                        surname,
                                        birthday,
                                        phone,
                                        direction,
                                        email,
                                        'A',
                                        dni,
                                        new Date()
                                )
                        );

                        welcome.panBtnReady.setBackground(new java.awt.Color(254,220,234));
                        welcome.btnReady.setForeground(new java.awt.Color(0, 0, 0));
                        welcome.btnReady.setBackground(new java.awt.Color(254,220,234));

                        welcome.lblDataConfirm.setBackground(new java.awt.Color(194, 48, 111));
                        welcome.panDataConfirm.setForeground(new java.awt.Color(255,230,240));

                        welcome.panReady.setForeground(new java.awt.Color(0, 0, 0));
                        welcome.lblReady.setBackground(new java.awt.Color(255,230,240));

                        support.cardSelection(welcome.panCard, welcome.panReadyOp);  
                        
                    }
                                     
                } else
                    popup = new PopupMessage(
                            welcome, 
                            true, 
                            6, 
                            "El código de confirmación no es correcto."
                    );
                
            } else
                popup = new PopupMessage(
                        welcome, 
                        true, 
                        6, 
                        "El correo ingresado no coincide oon el correo "
                                + "proporcionado en el registro."
                );
            
        }
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botones de confirmación ">
        else if(evt.getSource() == welcome.btnOk) {
            
            welcome.dispose();
            ctrlLogin = new ControllerLogin();
            
        }
        //</editor-fold>
        
    }
        
}

