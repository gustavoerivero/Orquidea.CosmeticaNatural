package lib;

// Se importan las librerías a utilizar.
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Gustavo
 */
public class SupportFunctions {
        
    /**
     * Método para utilizar de manera cómoda y rápida el CardLayout.
     * @param base JPanel Base; es el JPanel contenedor o padre.
     * @param opc  JPanel Opc; es el JPanel que se va a mostrar o hijo.
     */
    public void cardSelection(JPanel base, JPanel opc){
        base.removeAll(); // Elimina el contenido del JPanel principal.
        base.add(opc); // Añade el segundo JPanel al JPanel principal.
        base.repaint(); // Actualiza el contenido del JPanel principal.
        base.revalidate(); // Validar el contenido del JPanel principal.
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Métodos de validación ">

    /**
     * Método para validar números enteros y positivos
     * @param evt Variable KeyEvent.
     */
    public void integerPositiveKeyTyped(java.awt.event.KeyEvent evt){
        // Se trae el caracter ingresado en el campo de texto correspondiente.
        char numbers = evt.getKeyChar();
        // Se aplica la condición para que se elimine o no el caracter.
        if(numbers < '0' || numbers > '9')
            // Si cumple la condición, el caracter se elimina.
            evt.consume();
    }
    
    /**
     * Método para validar letras del abecedario.
     * @param evt variable de tipo KeyEvent
     */
    public void alphabetKeyTyped(java.awt.event.KeyEvent evt){
        // Se trae el caracter ingresado en el campo de texto correspondiente.
        char letters = evt.getKeyChar();
        // Se aplica la condición para que se elimine o no el caracter.
        if((letters < 'a' || letters > 'z') && (letters < 'A' || letters > 'Z') 
                && (letters != ' '))
            // Si cumple la condición, el caracter se elimina.
            evt.consume();
    }
    
    /**
     * Método para comprobar que dos contraseñas son iguales.
     * @param passOne Primera contraseña.
     * @param passTwo Segunda contraseña.
     * @return Variable booleana.
     */
    public boolean isPasswordCorrect(char[] passOne, char[] passTwo) {
        return new String(passOne).equals(new String(passTwo));        
    }
        
    /**
     * Método para verificar un correo electrónico.
     * @param email correo electrónico a verificar.
     * @return variable booleana.
     */
    public boolean verifyEmail(String email){
        
        //<editor-fold defaultstate="collapsed" desc=" Explicación de la expresión regular utilizada ">
        /*
         *  ^ especifica el inicio de la entrada.
         *  ([_a-z0-9-]) primer grupo. Se refiere a la aparición de uno o más 
         *      caracteres compuestos por guión bajo, letras, números y guiones.
         *  (\\.[_a-z0-9-]) segundo grupo. Puede ser opcional y repetible, se 
         *      refiere a la aparición de un punto seguido de uno o más caracte-
         *      res compuestos por guión bajo, letras, números y guiones.
         *  *@ carácter arroba.
         *  ([a-z0-9-]) tercer grupo. Especifica la aparición de uno o más ca-
         *      racteres compuestos por letras, números y guiones.
         *  (\\.[a-z0-9-]) cuarto grupo. Especifica un punto seguido de uno o 
         *      más caracteres compuestos por letras, números y guiones.
         *  (\\.[a-z]{2,4}) quinto grupo. Especifica un punto seguido de entre 
         *      2 y 4 letras, con el fin de considerar dominios terminados, por 
         *      ejemplo, en .co y .info.
         *  $ especifica el fin de la entrada.
         */
        //</editor-fold>
        String emailPattern =   "^[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@" +
                                "[a-zA-Z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";
        
        // Se compila la expresión.
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(emailPattern);
        
        // El correo pasado por parámetro no puede encontrarse vacío.
        if(email != null){
            
            /* 
             * En caso de que el email no sea nulo, se le aplica el patrón y se 
             * comprueba si cumple con este o no para mostrar por la salida es-
             * tándar el mensaje Valido.
             */
            java.util.regex.Matcher matcher = pattern.matcher(email);
            if (matcher.matches()){
                System.out.println("Email válido");
                return true;
            }
            else{
                System.out.println("Email no válido. Error: Formato no válido.");
                return false;
            }
        }
        // De encontrarse vacío.
        else
            return false;
        
    }
    
    /**
     * Método para verificar que una contraseña tenga el formato solicitado
     * por el sistema.
     * @param password Contraseña ingresada en el sistema a verificar.
     * @param minLength Longitud mínima permitida para la contraseña.
     * @param maxLength Longitud máxima permitida para la contraseña.
     * @param type Tipo de contraseña solicitada por el sistema:
     * '0' Se permite el uso de caracteres alfanuméricos y especiales.
     * '1' Se permite el uso de caracteres alfanuméricos.
     * '2' Se permite el uso de caracteres alfabéticos.
     * '3' Se permite el uso de caracteres numéricos.
     * @return 'Verdadero' si la contraseña contiene el formato correcto, 
     * 'falso' para caso contrario.
     */
    public boolean verifyPassword(char[] password, int minLength, int maxLength, int type){
        
        //<editor-fold defaultstate="collapsed" desc=" Explicación de la expresión regular utilizada ">
        /*
         * ^                 # Inicio de la expresión
         * (?=.*[0-9])       # Un dígito numérico.
         * (?=.*[a-z])       # Al menos una letra minúscula.
         * (?=.*[A-Z])       # Al menos una letra mayúscula.
         * (?=.*[@#$%^&+=])  # Al menos un caracter especial.
         * (?=\S+$)          # No permitir espacios en blanco.
         * .{8,}             # Al menos 8 caracteres.
         * $                 # Fin de la expresión.
         */
        //</editor-fold>
        String  passPattern = "";
        
        switch (type) {
            case 0:
                passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=*-_])(?=\\S+$).{" +
                        String.valueOf(minLength) + "," + String.valueOf(maxLength) + "}$";
                break;
            case 1:
                passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{" +
                        String.valueOf(minLength) + "," + String.valueOf(maxLength) + "}$";
                break;
            case 2:
                passPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{" +
                        String.valueOf(minLength) + "," + String.valueOf(maxLength) + "}$";
                break;
            case 3:
                passPattern = "^(?=.*[0-9])(?=\\S+$).{" +
                        String.valueOf(minLength) + "," + String.valueOf(maxLength) + "}$";
                break;
        }
        
        if(new String(password).matches(passPattern)){
            System.out.println("Contraseña válida.");
            return true;
        } else {
            System.out.println("Contraseña no válida. "
                    + "Error: La contraseña no posee el formato correspondiente.");
            return false;
        }
                    
    }
    
    //</editor-fold>
    
    /**
     * Método para dar formato a variables de tipo Double.
     * @param number es el número al que se le quiere dar un formato.
     * @param decimal la cantidad de decimales que se quieren mostrar.
     * @return retorna el número con el formato deseado.
     */
    public Double numberDecimalFormat(Double number, Integer decimal){
        return Math.round(number * Math.pow(10, decimal)) / Math.pow(10, decimal);
    }
    
    /**
     * Método para obtener sentencia String con datos aleatorios.
     * @param type Según sea el tipo, la sentencia a construir es distinta:
     * - type '0': Números en el rango [0,9].
     * - type '1': Todo el abecedario en letras mayúsculas, minúsculas y los 
     * números en el rango [0,9].
     * - type '2': Todo el abecedario en letras mayúsculas y minúsculas.
     * - type '3': Todo el abecedario en letras mayúsculas.
     * - type '4': Todo el abecedario en letras minúsculas.
     * @param lenght Longitud que tendrá la sentencia.
     * @return Sentencia de datos aleatorios de tipo String.
     */
    public String randomCharacterString(char type, int lenght){
        
        // Array de caracteres válidos para el código de confirmación.
        char[] chars = null;
        
        // StringBuilder de longitud 'lenght'.
        StringBuilder sb = new StringBuilder(lenght);

        // Instanciar clase Random.
        java.util.Random random = new java.util.Random();

        // Segun el type se obtiene una cadena distinta.
        switch(type){
            
            /*
             * type '0': Números en el rango [0,9].
             */
            case '0':
                chars = "0123456789".toCharArray();
            
            /*
             * type '1': Todo el abecedario en letras mayúsculas, minúsculas y
             *           los números en el rango [0,9].
             */
            case '1':                
                chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789".toCharArray();
            
            /*
             * type '2': Todo el abecedario en letras mayúsculas y minúsculas.
             */
            case '2':
                chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();
                
            /*
             * type '3': Todo el abecedario en letras mayúsculas.
             */
            case '3':
                chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            
            /*
             * type '4': Todo el abecedario en letras minúsculas.
             */
            case '4':
                chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            
        }
        
        // Ciclo para construir aleatoriamente la variable StringBuilder.
        for (int i = 0; i < lenght; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        
        // Retorna el valor obtenido en forma de String.
        return sb.toString();
        
    }
    
    /**
     * Método para disminuir la opacidad de un JFrame y dar valores a variables
     * de ubicación del Mouse.
     * @param xx Posición del Mouse sobre el eje horizontal.
     * @param xy Posicioón del Mouse sobre el eje vertical.
     * @param frame JFrame a modificar su opacidad.
     * @param evt Evento de Mouse.
     */
    public void mousePressed(int xx, int xy, JFrame frame, java.awt.event.MouseEvent evt){
        
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
         * Este método posee dos características:
         *      1) La opacidad de la aplicación disminuye un 20%.
         *      2) Se obtiene la ubicación del Mouse en el momento.
         */
        
        // Se coloca la opacidad de la aplicación en 80%.
        //</editor-fold>
        frame.setOpacity((float)0.8);
        
        // Se obtiene la ubicación del Mouse en el momento.
        xx = evt.getX(); // Ubicación con respecto al eje X.
        xy = evt.getY(); // Ubicación con respecto al eje Y.
        
    }
    
    /**
     * Método para colocar la opacidad original del JFrame.
     * @param frame 
     */
    public void mouseReleased(JFrame frame){
        
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
         * Este método devuelve la opacidad de la aplicación a su valor base.
         */
        
        // Se coloca la opacidad de la aplicación en 100%.
        //</editor-fold>
        frame.setOpacity((float)1.0);
        
    }
    
    /**
     * Método para reubicar el JFrame.
     * @param xx Ubicación del mouse en el eje horizontal.
     * @param xy Ubicación del mouse en el eje vertical.
     * @param frame JFrame a reubicar.
     * @param evt Evento del Mouse
     */
    public void mouseDragged(int xx, int xy, JFrame frame, java.awt.event.MouseEvent evt){
        
        //<editor-fold defaultstate="collapsed" desc=" Explicación sobre el método ">
        /*
         * Este método permite mover la aplicación por toda la pantalla del
         * computador del usuario.
         */
        
        // Se declaran las variables que obtienen la ubicación de la aplicación.
        //</editor-fold>
        int x = evt.getXOnScreen(); // Ubicación con respecto al eje X.
        int y = evt.getYOnScreen(); // Ubicación con respecto al eje Y.
        
        // Se ubica la aplicación en la nueva ubicación.
        frame.setLocation(x - xx, y - xy);
        
    }
    
    /**
     * Realiza las configuraciones visuales iniciales que debe tener el JFrame.
     * @param frame JFrame que se va a configurar.
     */
    public void initialOps(JFrame frame){
                
        // Ubica el JFrame en el centro de la pantalla.
        frame.setLocationRelativeTo(null);
        
        // Muestra el JFrame.
        frame.setVisible(true);
        
        // Cambia el ícono del JFrame.
        frame.setIconImage(imageResource("/views/images/giant/flowerLogo.png"));
                        
    }
    
    /**
     * Realiza las configuraciones visuales iniciales que debe tener el JFrame.
     * @param dialog JDialog que se va a configurar.
     */
    public void initialOps(JDialog dialog){
                
        // Ubica el JFrame en el centro de la pantalla.
        dialog.setLocationRelativeTo(null);
        
        // Muestra el JFrame.
        dialog.setVisible(true);
        
        // Cambia el ícono del JFrame.
        dialog.setIconImage(imageResource("/views/images/giant/flowerLogo.png"));
                
    }
    
    /**
     * Devuelve la imagen en la ruta pasada por parámetro.
     * @param imagePath Ruta de la imagen que se desea obtener.
     * @return Retorna imagen.
     */
    public Image imageResource(String imagePath){
        return new ImageIcon(getClass().getResource(imagePath)).getImage();
    }
    
    /**
     * Devuelve el icono en la ruta pasada por parámetro.
     * @param iconPath Ruta de la imagen que se desea obtener.
     * @return Retorna imagen.
     */
    public ImageIcon iconResource(String iconPath){
        return new ImageIcon(getClass().getResource(iconPath));
    }
        
    /**
     * Le da un ícono al JLabel pasado por parámetro. Cabe destacar que el ícono 
     * es de 50px.
     * @param type Depende del tipo de ícono que se desea agregar:
     * '0'  :   About
     * '1'  :   Alarm
     * '2'  :   Approved
     * '3'  :   Atention
     * '4'  :   Birthday
     * '5'  :   Delivery
     * '6'  :   Error
     * '7'  :   Expired
     * '8'  :   Help
     * '9'  :   Hide
     * '10' :   HighPriority
     * '11' :   Idea
     * '12' :   Information
     * '13' :   LowPriority
     * '14' :   MediumPriority
     * '15' :   Ok
     * '16' :   Private
     * '17' :   Proactivity
     * '18' :   Remember
     * '19' :   Show
     * '20' :   Talk
     * '21' :   Verified Account
     * '22' :   Verified
     * '23' :   Wake Up
     * '24' :   Warning
     * @return JLabel configurado.
     */
    public Icon iconForLabels(int type){
        
        Icon icon = null;
        
        // Identificar el tipo de mensaje
        switch(type){
            
            // type == 0 -> About
            case 0:
                icon = iconResource("/views/images/large/aboutIcon.png");
                break;
            
            // type == 1 -> Alarm
            case 1:
                icon = iconResource("/views/images/large/alarmIcon.png");
                break;
                
            // type == 2 -> Approved
            case 2:
                icon = iconResource("/views/images/large/approvedIcon.png");
                break;
                
            // type == 3 -> Atention
            case 3:
                icon = iconResource("/views/images/large/atentionIcon.png");
                break;
                
            // type == 4 -> Birthday
            case 4:
                icon = iconResource("/views/images/large/birthdayIcon.png");
                break;
                
            // type == 5 -> Delivery
            case 5:
                icon = iconResource("/views/images/large/deliveryIcon.png");
                break;
                
            // type == 6 -> Error
            case 6:
                icon = iconResource("/views/images/large/errorIcon.png");
                break;
            
            // type == 7 -> Expired
            case 7:
                icon = iconResource("/views/images/large/expiredIcon.png");
                break;
                            
            // type == 8 -> Help
            case 8:
                icon = iconResource("/views/images/large/helpIcon.png");
                break;
                
            // type == 9 -> Hide
            case 9:
                icon = iconResource("/views/images/large/hideIcon.png");
                break;
                
            // type == 10 -> HighPriority
            case 10:
                icon = iconResource("/views/images/large/highPriorityIcon.png");
                break;
                
            // type == 11 -> Idea
            case 11:
                icon = iconResource("/views/images/large/ideaIcon.png");
                break;
                
            // type == 12 -> Information
            case 12:
                icon = iconResource("/views/images/large/informationIcon.png");
                break;
                
            // type == 13 -> LowPriority
            case 13:
                icon = iconResource("/views/images/large/lowPriorityIcon.png");
                break;
                
            // type == 14 -> MediumPriority
            case 14:
                icon = iconResource("/views/images/large/mediumPriorityIcon.png");
                break;
                
            // type == 15 -> Ok
            case 15:
                icon = iconResource("/views/images/large/okIcon.png");
                break;
                
            // type == 16 -> Private
            case 16:
                icon = iconResource("/views/images/large/privateIcon.png");
                break;
                
            // type == 17 -> Proactivity 
            case 17:
                icon = iconResource("/views/images/large/proactivityIcon.png");
                break;
                
            // type == 18 -> Remember
            case 18:
                icon = iconResource("/views/images/large/rememberIcon.png");
                break;
                
            // type == 19 -> Show
            case 19:
                icon = iconResource("/views/images/large/showIcon.png");
                break;
                
            // type == 20 -> Talk
            case 20:
                icon = iconResource("/views/images/large/talkIcon.png");
                break;
                
            // type == 21 -> Verified Account
            case 21:
                icon = iconResource("/views/images/large/verifiedAccountIcon.png");
                break;
                
            // type == 22 -> Verified
            case 22:
                icon = iconResource("/views/images/large/verifiedIcon.png");
                break;
                
            // type == 23 -> WakeUp
            case 23:
                icon = iconResource("/views/images/large/wakeUpIcon.png");
                break;
                
            // type == 24 -> Warning
            case 24:
                icon = iconResource("/views/images/large/warningIcon.png");
                break;
                
        }
        
        // Devuelve el ícono deseado.
        return icon;
        
    }
    
    /**
     * Método que convierte una cadena de bytes en una imagen.
     * @param bytes Array que contiene los binarios de la imagen.
     * @return La imagen en formato Image.
     * @throws java.io.IOException Excepción de lectura de archivo.
     */
    public Image convertImage(byte[] bytes) throws java.io.IOException {
                
        java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bytes);
        java.util.Iterator readers = javax.imageio.ImageIO.getImageReadersByFormatName("jpeg");
        javax.imageio.ImageReader reader = (javax.imageio.ImageReader) readers.next();
        Object source = bis;
        javax.imageio.stream.ImageInputStream iis = javax.imageio.ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        javax.imageio.ImageReadParam param = reader.getDefaultReadParam();
        return reader.read(0, param);
        
    }
    
}
