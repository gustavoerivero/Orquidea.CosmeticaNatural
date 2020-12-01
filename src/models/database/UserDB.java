
package models.database;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import lib.ConnectionDB;
import models.User;

/**
 *
 * @author Gustavo
 */
public class UserDB {
    
    private ConnectionDB con = new ConnectionDB();
    
    /**
     * Constructor.
     */
    public UserDB(){}
    
    /**
     * Método para comprobar si el usuario que desea ingresar al sistema se 
     * encuentra registrado.
     * @param email correo electrónico del usuario.
     * @param pass contraseña del usuario.
     * @return variable booleana.
     */
    public boolean signer(String email, String pass){
        
        if(userExist(email, 'A')) {
            
            try{
            
                con.connect();

                // Se descrie la sentencia SQL.
                String SQL =    "SELECT * FROM \"User\" WHERE \"email\" = '"
                                + email + "' AND \"password\" = '" + pass + 
                                "' AND \"state\" = 'A';";

                // Se realiza la consulta y se obtiene el resultado.
                java.sql.ResultSet rs = con.queryConsult(SQL);

                // Se desconecta la BD.
                con.disconnect();

                return rs.next();

            } catch (java.sql.SQLException ex){
                System.out.println("No se pudo encontrar el usuario. Error: " + ex);
            }

            // De no encontrarse ningún resultado, retorna 'false'.
            return false;
            
        } else {
            
            System.out.println("No se pudo encontrar el usuario.");
            
            return false;
            
        }    
                
    }
    
    /**
     * Método para comprobar la existencia de un usuario.
     * @param email correo electrónico del usuario.
     * @return variable booleana.
     */
    public boolean signer(String email){
        
        try{
            
            con.connect();
          
            // Se declara una sentencia SQL.
            String SQL =    "SELECT * FROM \"User\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = 'A';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsult(SQL);
            
            // Se desconecta la BD.
            con.disconnect();
            
            // Si el usuario existe (que debe ser único) retorna 'true'.
            return rs.next();
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar el usuario. Error: " + ex);
        }
        
        // Si el usuario no existe, retorna 'false'.
        return false;
        
    }
  
    public boolean userExist(String email, char state){
        
        try{
            
            con.connect();
          
            // Se declara una sentencia SQL.
            String SQL =    "SELECT * FROM \"User\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = '" + state + "';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsult(SQL);
            
            // Se desconecta la BD.
            con.disconnect();
            
            // Si el cliente existe (que debe ser único) retorna 'true'.
            return rs.next();
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar al usuario. Error: " + ex);
        }
        
        // Si el usuario no existe, retorna 'false'.
        return false;
        
    }
    
    /**
     * Método para actualizar la contraseña de un usuario.
     * @param email correo electrónico del usuario.
     * @param pass nueva contraseña
     */
    public void insertNewPass(String email, String pass){
       
        con.connect();
          
        // Se declara la sentencia SQL.
        String SQL =    "UPDATE \"User\" SET \"password\" = '" + pass + 
                        "' WHERE \"email\" = '" + email + "';";
            
        // Se realiza la actualización.
        con.queryInsert(SQL);
            
        // Se desconecta la BD.
        con.disconnect();
                 
    }
    
    /**
     * Método para obtener el atributo identificador de un usuario.
     * @param email Correo electrónico del usuario.
     * @return Devuelve el atributo identificador del usuario.
     */
    public int getId(String email) {
        
        int id = -1;
        
        try {
            
            String  SQL  = "SELECT \"id\" FROM \"User\" WHERE \"email\" = '" + email + "';";

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();

            while(result.next())
                id = result.getInt("id");

            System.out.println("El usuario '" + email + "' tiene como id = '" + id + "'");
                           
        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión: " + ex);
        }
                
        return id;
        
    }
    
    /**
     * Método para obtener el correo electrónico de un usuario.
     * @param id Atributo identificador de un usuario.
     * @return Devuelve el correo electrónico del usuario.
     */
    public String getEmail(int id) {
        
        String email = null;
        
        try {
            
            String  SQL  = "SELECT \"email\" FROM \"User\" WHERE \"id\" = '" + id + "';";

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();

            while(result.next())
                email = result.getString("email");

            System.out.println("El usuario '" + id + "' tiene como correo electrónico = '" + email + "'");
                           
        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión: " + ex);
        }
                
        return email;
        
    }
    
    /**
     * Método para obtener la contraseña de un usuario.
     * @param email Correo electrónico de un usuario.
     * @return Devuelve la contraseña del usuario.
     */
    public String getPassword(String email) {
        
        String pass = null;
        
        try {
            
            String  SQL  = "SELECT \"password\" FROM \"User\" WHERE \"email\" = '" + email + "';";

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();

            while(result.next())
                pass = result.getString("password");

            System.out.println("El usuario '" + email + "' tiene como contraseña = '" + pass + "'");
                           
        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión: " + ex);
        }
                
        return pass;
        
    }
    
        /**
     * Método para obtener la contraseña de un usuario.
     * @param id Atributo identificador del usuario.
     * @return Devuelve la contraseña del usuario.
     */
    public String getPassword(int id) {
        
        String pass = null;
        
        try {
            
            String  SQL  = "SELECT \"password\" FROM \"User\" WHERE \"id\" = '" + id + "';";

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();

            while(result.next())
                pass = result.getString("password");

            System.out.println("El usuario '" + id + "' tiene como contraseña = '" + pass + "'");
                           
        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión: " + ex);
        }
                
        return pass;
        
    }

    /**
     * Método para obtener los datos de un usuario.
     * @param email
     * @return Devuelve consulta.
     */
    public ResultSet readUserData(String email){
        
        // Se declara una variable de tipo 'ResultSet' para realizar la consulta.
        ResultSet result;
        
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL = "SELECT \"dni\", \"name\", \"surname\", \"userEmail\", "
                    + "\"type\", \"firstSession\", \"lastSession\" FROM \"User\", "
                    + "\"Employee\" WHERE \"email\" = \"userEmail\" AND \"email\" = '" 
                    + email + "' AND \"User\".\"state\" = Employee.\"state\" AND "
                    + "Employee.\"state\" = 'A';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Método para registrar en la base de datos un nuevo usuario.
     * @param user Clase Usuario.
     */
    public void registerUser(User user) {
            
        con.connect();
        
        // Se desclara la sentencia SQL.
        String SQL = "INSERT INTO \"User\" (\"id\", \"email\", "
                    + "\"password\", \"UserTypeid\", \"firstSession\", \"lastSession\", "
                    + "\"rememberData\", \"state\") "
                    + "VALUES ("
                    + "'" + user.getId() + "', "
                    + "'" + user.getEmail() + "', "
                    + "'" + user.getPassword() + "', "
                    + "'" + user.getUserTypeId() + "', "
                    + "NULL, "
                    + "NULL, "
                    + "'" + user.getRememberData() + "', "
                    + "'" + user.getState() + "'"
                    + ");";
    
        // Se insertan los datos en la BD.
        con.queryInsert(SQL);
        
        // Se muestra el mensaje de éxito.
        System.out.println("El usuario del correo \"" + user.getEmail() + "\" se"
                + " ha registrado con éxito.");
     
        // Se desconecta la BD.
        con.disconnect();
        
    }
   
    /**
     * Método para actualizar a un usuario en la Base de Datos.
     * @param user Usuario que se desea actualizar.
     */
    public void updateUser(User user) {
         
        con.connect(); 

        // Se describe la sentencia SQL.
        String SQL = "UPDATE \"User\" SET \"email\" = '" + user.getEmail() + 
                    "', \"password\" = '" + user.getPassword() + 
                    "', \"UserTypeId\" = '" + user.getUserTypeId() + 
                    "', \"state\" = '" + user.getState() + 
                    "', \"rememberData\" = '" + user.getRememberData() +
                    "', \"firstSession\" = '" + user.getFirstSession() +
                    "', \"lastSession\" = '" + user.getLastSession() +
                    "' WHERE \"id\" = '" + user.getId() + "';";
            
        con.queryInsert(SQL);
        
        System.out.println("Se ha actualizado el usuario " + user.getEmail() + 
                "con éxito.");
            
        // Se desconecta la BD.
        con.disconnect();
            
    }
         
    /**
     * Método para cambiar el estado de un usuario.
     * @param email Correo del usuario a eliminar.
     * @param type Si el cambio es a un estado 'Activo' o estado 'Inactivo'.
     */
    public void changeStateUser(String email, int type) {
        
        // Se declara la variable de sentencia SQL.
        String SQL = "";
        
        // Dependiendo del valor de type, se elimina (lógica) o se reactiva el empleado.
        if(type == 0)
            SQL     = "UPDATE \"User\" SET \"state\" = 'I' "
                    + "WHERE \"email\" = '" + email + "';";
        else
            SQL     = "UPDATE \"User\" SET \"state\" = 'A' "
                    + "WHERE \"email\" = '" + email + "';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        con.queryInsert(SQL);
        
        // Dependiendo del valor de type, se muestra mensaje de éxito.
        if(type == 0)
            System.out.println("La eliminación del usuario cuyo correo es '" + email + "' "
                    + "se ha efectuado con éxito.");
        else
            System.out.println("La reactivación del usuario cuyo correo es '" + email + "' "
                + "se ha efectuado con éxito.");
                
        // Se desconecta la BD.
        con.disconnect();
        
    }
    
    /**
     * Método para comprobar si el usuario que desea ingresar al sistema iniciará
     * sesión por primera vez o no.
     * @param email correo electrónico del usuario.
     * @return variable booleana.
     */
    public boolean firstSessionUser(String email){
        
        try{
            
            con.connect();
          
            String SQL =    "SELECT \"firstSession\" FROM \"User\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = 'A';";
            
            java.sql.ResultSet rs = con.queryConsult(SQL);
            
            con.disconnect();
            
            rs.next();
            
            if(rs.getDate("firstSession") == null) {
                System.out.println("El usuario '" + email + "' no ha iniciado "
                        + "sesión por primera vez.");
                return true;
            }
                            
        } catch (java.sql.SQLException ex){
            System.out.println("Error en la comparación de fechas: " + ex);
        }
        
        System.out.println("El usuario '" + email + "' ya ha iniciado "
                + "sesión por primera vez.");
        return false;
        
    }
    
    /**
     * Método para olvidar los datos de acceso del sistema.
     */
    public void forgetCredentials() {
        
        con.connect();
            
        String  SQL = "UPDATE \"User\" SET \"rememberData\" = 'I' "
                + "WHERE \"rememberData\" = 'A';";        

        // Se realiza la inserción de datos.
        con.queryInsert(SQL);

        // Se muestra mensaje de éxito.
        System.out.println("Se olvidan los datos de usuarios.");

        // Se desconecta la BD.
        con.disconnect();
        
    }
    
    /**
     * Método para actualizar fechas de un usuario.
     * @param email Correo del usuario a actualizar fecha.
     * @param rememberData Recordar datos del usuario en el sistema.
     */
    public void changeDateUser(String email, boolean rememberData) {
        
        // Se declara la variable de sentencia SQL.
        String SQL = "";
        
        Date date = new Date();
                
        if(firstSessionUser(email)){
            
            con.connect();
            
            SQL = "UPDATE \"User\" SET \"firstSession\" = '" + date
                + "' WHERE \"email\" = '" + email + "';";
            
            // Se realiza la inserción de datos.
            con.queryInsert(SQL);
            
            // Se muestra mensaje de éxito.
            System.out.println("La actualización del primer inicio del usuario "
                    + "cuyo correo es '" + email + "' se ha efectuado con éxito.");
            
            System.out.println("Primer inicio: " + date);
            
            con.disconnect();
            
        }
        
        con.connect();
            
        SQL = "UPDATE \"User\" SET \"lastSession\" = '" + date
            + "' WHERE \"email\" = '" + email + "';";        
        
        // Se realiza la inserción de datos.
        con.queryInsert(SQL);
        
        // Se muestra mensaje de éxito.
        System.out.println("La actualización del último inicio del usuario "
                + "cuyo correo es '" + email + "' se ha efectuado con éxito.");
        
        System.out.println("Último inicio: " + date);
          
        // Se desconecta la BD.
        con.disconnect();
        
        if(rememberData) {
            
            // Se olvidan todos los datos de accesos recordados.
            forgetCredentials();
            
            con.connect();
            
            SQL = "UPDATE \"User\" SET \"rememberData\" = 'A' "
                    + "WHERE \"email\" = '" + email + "';";        

            // Se realiza la inserción de datos.
            con.queryInsert(SQL);

            // Se muestra mensaje de éxito.
            System.out.println("El usuario '" + email + "' mantendrá sus datos "
                    + "de usuario recordados en el sistema.");

            // Se desconecta la BD.
            con.disconnect();
            
        }
        
    }
 
    /**
     * Método para consultar la información del empleado que se encuentra iniciando
     * sesión.
     * @param email Correo electrónico del usuario que está iniciando sesión
     * @return Retorna consulta.
     */
    public ResultSet getDataAccess(String email){
        
        // Se declara e instancia la variable con la sentencia SQL para la consulta.
        String SQL  = "SELECT * FROM \"User\" WHERE \"email\" = '" + email + "' "
                    + "AND \"state\" = 'A';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        ResultSet result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
   
    /**
     * Consulta de imagen de perfil de usuario por campo 'id'.
     * @param id Campo identificador del usuario.
     * @return Devuelve array de bytes.
     */
    public ResultSet consultPhoto(int id) {
        
        // Se declara e instancia la variable con la sentencia SQL para la consulta.
        String SQL  = "SELECT \"photo\" FROM \"User\" WHERE \"id\" = '" + id + "' "
                    + "AND \"state\" = 'A';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        ResultSet result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Consulta de imagen de perfil de usuario por campo 'email'.
     * @param email Correo electrónico del usuario.
     * @return Devuelve array de bytes.
     */
    public ResultSet consultPhoto(String email) {
        
        // Se declara e instancia la variable con la sentencia SQL para la consulta.
        String SQL  = "SELECT \"photo\" FROM \"User\" WHERE \"email\" = '" + email + "' "
                    + "AND \"state\" = 'A';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        ResultSet result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Método que permite actualizar la foto de un usuario.
     * @param id Campo identificador del usuario.
     * @param photo Foto que se va a actualizar.
     * @return 'Verdadero' si se pudo realizar la actualización de foto, 'Falso' 
     * para caso contrario.
     */
    public boolean updatePhoto(int id, java.io.File photo) {
        
        java.io.FileInputStream fis = null;
        
        try {
            
            fis = new java.io.FileInputStream(photo);
            
            try (java.sql.PreparedStatement pstm = con.connect().prepareStatement(
                    "UPDATE \"User\" SET \"photo\" = ? WHERE \"id\" = ?;"
            )) {
                pstm.setBinaryStream(1, fis, (int) photo.length());
                pstm.setInt(2, id);
                
                pstm.execute();
            }
            
            return true;
            
        } catch (java.io.FileNotFoundException | java.sql.SQLException ex) {
            System.out.println("Error: " + ex);
        } finally {
            try {
                fis.close();
            } catch (java.io.IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
        
        return false;
        
    }
    
    /**
     * Método que permite actualizar la foto de un usuario.
     * @param email Correo electrónico del usuario.
     * @param photo Foto que se va a actualizar.
     * @return 'Verdadero' si se pudo realizar la actualización de foto, 'Falso' 
     * para caso contrario.
     */
    public boolean updatePhoto(String email, java.io.File photo) {
        
        java.io.FileInputStream fis = null;
        
        try {
            
            fis = new java.io.FileInputStream(photo);
            
            try (java.sql.PreparedStatement pstm = con.connect().prepareStatement(
                    "UPDATE \"User\" SET \"photo\" = ? WHERE \"email\" = ?;"
            )) {
                pstm.setBinaryStream(1, fis, (int) photo.length());
                pstm.setString(2, email);
                
                pstm.execute();
            }
            
            return true;
            
        } catch (java.io.FileNotFoundException | java.sql.SQLException ex) {
            System.out.println("Error: " + ex);
        } finally {
            try {
                fis.close();
            } catch (java.io.IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
        
        return false;
        
    }
    
    /**
     * Método que permite actualizar la foto de un usuario.
     * @param email Correo electrónico del usuario.
     */
    public void deletePhoto(String email) {
                    
        String SQL = "UPDATE \"User\" SET \"photo\" = NULL WHERE \"email\" = '" + email + "';";

        con.connect();

        con.queryInsert(SQL);

        con.disconnect();
        
        System.out.println("La foto del usuario de correo '" + email + "' ha sido eliminada.");
            
    }
    
    /**
     * Método para saber si existe un usuario con datos guardados en la Base de Datos.
     * @return Devuelve 'Verdadero' por si existe un usuario con datos guardados, 'falso' para caso contrario.
     */
    public boolean rememberUser() {
        
        try {
            
            String  SQL  = "SELECT \"email\" FROM \"User\" WHERE \"rememberData\" = 'A';";                

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();
        
            return result.next();
            
        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión: " + ex);
        }
            return false;

    }
    
    /**
     * Método para obtener el correo electrónico de un usuario que mantiene sus datos almacenados en el sistema.
     * @return Devuelve correo electrónico de un usuario.
     */
    public String getRememberedUserData() {
        
        try {
            
            String  SQL  = "SELECT \"email\" FROM \"User\" WHERE \"rememberData\" = 'A';",
                    data = null;

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();

            while(result.next())
                data = result.getString("email");

            System.out.println("El usuario '" + data + "' mantiene sus datos recordados en el sistema.");

            // Retorna consulta.
            return data;
                           
        } catch (SQLException ex) {
            System.out.println("Error de inicio de sesión: " + ex);
        }
        
        return null;
        
    }
    
    /**
     * Método para obtener un listado de todos los usuarios activos de la empresa.
     * @return Listado de todos los usuarios.
     */
    public java.util.ArrayList<User> getAllUsers() {
        
        java.util.ArrayList<User> users = new java.util.ArrayList<>();
        
        try {
            
            String  SQL  = "SELECT * FROM \"User\" WHERE \"state\" = 'A';";

            con.connect();

            // Se realiza y se recibe la consulta.
            ResultSet result = con.queryConsult(SQL);

            // Se desconecta la BD.
            con.disconnect();

            while(result.next()) {
                
                User supportUser = new User(result.getInt("id"), 
                        result.getInt("UserTypeid"), 
                        result.getString("email"), 
                        result.getString("password"),
                        result.getString("rememberData").charAt(0),
                        result.getString("state").charAt(0),
                        result.getDate("firstSession"),
                        result.getDate("lastSession"), 
                        null);
                
                java.io.InputStream is = result.getBinaryStream("photo");
                
                if(is != null)
                    try {
                        supportUser.setPhoto(new ImageIcon((java.awt.image.BufferedImage) (ImageIO.read(is))));
                    } catch (IOException ex) {
                        System.out.println("Error de conversión de imágenes de usuario. Error: " + ex);
                    }
                               
                users.add(supportUser);
                
            }
            
            System.out.println("Se ha obtenido la información de todos los usuarios activos con éxito.");

            // Retorna consulta.
            return users;
                           
        } catch (SQLException ex) {
            System.out.println("Error de obtención de datos de usuarios. Error: " + ex);
        }
        
        return null;
                
    }
    
}
