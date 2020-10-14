
package lib;

/**
 *
 * @author Gustavo
 */
public class Mail {
    
    /**
     * Variables String para el correo electrónico y contraseña.
     */
    private String  email,
                    pass;
        
    /**
     * Constructor de la clase Mail.
     * @param email Correo electrónico.
     * @param pass Contraseña.
     */
    public Mail(String email, String pass) {
        
        this.email  = email;
        this.pass   = pass;
        
    }
    
    /**
     * Constructor de la clase Mail.
     * @param email Correo electrónico emisor.
     * @param pass Contraseña del correo electrónico emisor.
     * @param to Correo electrónico receptor.
     * @param subject Asunto del correo a enviar.
     * @param content Contenido del correo a enviar
     */
    public Mail(String email, String pass, String to, String subject, String content) {
        
        this.email = email;
        this.pass = pass;
       
        if(sendMessage(to, subject, content))
            System.out.println("El correo ha sido enviado con éxito.");
        else  
            System.out.println("El correo no pudo ser enviado. Verifique los datos ingresados.");
        
    }
        
    /**
     * Método que permite realizar una autenticación con los datos del correo 
     * electrónico proporcionado.
     * @return Retorna dato de tipo Session.
     */
    private javax.mail.Session authentication(){
        
        // Se describen las propiedades de la sesión.
        java.util.Properties props = new java.util.Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Se instancia una nueva sesión.
        javax.mail.Session session = javax.mail.Session.getInstance(
                props, 
                new javax.mail.Authenticator() {
                        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                                return new javax.mail.PasswordAuthentication(email, pass);
                            }
                }
        );
            
        // Retorna estado de la sessión.
        return session;
        
    }
    
    /**
     * Método que envía un correo electrónico.
     * @param to Correo electrónico del receptor.
     * @param subject Asunto del correo a enviar.
     * @param content Contenido del correo a enviar.
     * @return Retorna variable booleana que indica si el correo es o no enviado.
     */
    public boolean sendMessage(String to, String subject, String content){
        
        try{
        
            // Se describen los emisores, receptores, asunto y mensaje.
            javax.mail.Message message = new javax.mail.internet.MimeMessage(authentication());
            message.setFrom(new javax.mail.internet.InternetAddress(email));
            message.setRecipients(javax.mail.Message.RecipientType.TO,
                    javax.mail.internet.InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(content);

            // Se envía el mensaje.
            javax.mail.Transport.send(message);

            // Se notifica que el correo fue enviado sin inconvenientes.
            System.out.println("El correo fue enviado con éxito.");
            
            return true;
                
        } catch (javax.mail.MessagingException ex) {
            
            // Se notifica que el correo no pudo ser enviado.
            System.out.println("El correo no pudo ser enviado. Error: " + ex);
            
            return false;
            
        } 
                
    }
  
}
