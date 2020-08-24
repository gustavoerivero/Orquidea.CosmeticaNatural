
package models.database;

import java.sql.ResultSet;
import java.util.Date;
import lib.ConnectionDB;
import models.User;

/**
 *
 * @author Gustavo
 */
public class UserDB {
    
    private ConnectionDB con;
    
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
        
        try{
            
            // Se instancia la clase para la conexión con la BD y se establece la conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se descrie la sentencia SQL.
            String SQL =    "SELECT * FROM \"user\" WHERE \"email\" = '"
                            + email + "' AND \"password\" = '" + pass + 
                            "' AND \"state\" = 'A';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsult(SQL);
            
            // Se desconecta la BD.
            con.disconnect();
            
            // Si se obtuvo un resultado (que tiene que ser único) retorna 'true'.
            return rs.next();
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar el usuario. Error: " + ex);
        }
        
        // De no encontrarse ningún resultado, retorna 'false'.
        return false;
        
    }
    
    /**
     * Método para comprobar la existencia de un usuario.
     * @param email correo electrónico del usuario.
     * @return variable booleana.
     */
    public boolean signer(String email){
        
        try{
            
            // Se instancia la clase de conexión con BD y se establece una conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se declara una sentencia SQL.
            String SQL =    "SELECT * FROM \"user\" WHERE \"email\" = '"
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
  
    public boolean userExist(String email, char estatus){
        
        try{
            
            // Se instancia la clase de conexión con BD y se establece una conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se declara una sentencia SQL.
            String SQL =    "SELECT * FROM \"user\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = '" + estatus + "';";
            
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
       
        // Se instancia la clase de conexión de la BD y se establece conexión.
        con = new ConnectionDB();
        con.connect();
          
        // Se declara la sentencia SQL.
        String SQL =    "UPDATE \"user\" SET \"password\" = '" + pass + 
                        "' WHERE \"email\" = '" + email + "';";
            
        // Se realiza la actualización.
        con.queryInsert(SQL);
            
        // Se desconecta la BD.
        con.disconnect();
                 
    }

    /**
     * Método para obtener los datos de un usuario.
     * @return Devuelve consulta.
     */
    public ResultSet readUserData(String email){
        
        // Se declara una variable de tipo 'ResultSet' para realizar la consulta.
        ResultSet result;
        
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL = "SELECT \"dni\", \"name\", \"surname\", \"userEmail\", "
                    + "\"type\", \"firstSession\", \"lastSession\" FROM \"user\", "
                    + "\"employee\" WHERE \"email\" = \"userEmail\" AND \"email\" = '" 
                    + email + "' AND \"user\".\"state\" = employee.\"state\" AND "
                    + "employee.\"state\" = 'A';";
        
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
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
            
        // Se instancia la clase para la conexiÃ³n con la BD y se establece la conexiÃ³n.
        con = new ConnectionDB();
        con.connect();
          
        // Se desclara la sentencia SQL.
        String SQL = "INSERT INTO \"user\" (\"id\", \"email\", "
                    + "\"password\", \"type\", \"firstSession\", \"lastSession\", "
                    + "\"rememberData\", \"state\") "
                    + "VALUES ("
                    + "'" + user.getId() + "', "
                    + "'" + user.getEmail() + "', "
                    + "'" + user.getPassword() + "', "
                    + "'" + user.getType() + "', "
                    + "'" + user.getFirstSession() + "', "
                    + "'" + user.getLastSession() + "', "
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
   
    public void updateUser(User user, String id) {
         
        // Se instancia la clase para la conexion con la BD y se establece la conexion.
        con = new ConnectionDB();
        con.connect(); 

        // Se descrie la sentencia SQL.
        String SQL = "UPDATE \"user\" SET \"email\" = '" + user.getEmail() + 
                    "', \"password\" = '" + user.getPassword() + 
                    "', \"type\" = '" + user.getType() + 
                    "', \"state\" = '" + user.getState() + 
                    "' WHERE \"id\" = " + id + ";";
            
        con.queryInsert(SQL);
            
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
            SQL     = "UPDATE \"user\" SET \"state\" = 'I' "
                    + "WHERE \"email\" = '" + email + "';";
        else
            SQL     = "UPDATE \"user\" SET \"state\" = 'A' "
                    + "WHERE \"email\" = '" + email + "';";
        
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
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
            
            // Se instancia la clase para la conexión con la BD y se establece la conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se descrie la sentencia SQL.
            String SQL =    "SELECT \"firstSession\" FROM \"user\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = 'A';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsult(SQL);
            
            // Se ubica el resultado obtenido.
            rs.next();
            
            // Se obtiene la fecha de la base de datos.
            Date obtainedDate = rs.getDate("firstSession");
            
            // Se comparan las fechas. Si no hay "primer inicio" retorna 'true'..
            if(obtainedDate == null)
                return true;
            
            // Se desconecta la BD.
            con.disconnect();
            
        } catch (java.sql.SQLException ex){
            System.out.println("Error en la comparación de fechas: " + ex);
        }
        
        // Si existe una fecha en el "primer inicio" retorna 'false'.
        return false;
        
    }
    
    /**
     * Método para actualizar fechas de un usuario.
     * @param email Correo del usuario a actualizar fecha.
     */
    public void changeDateUser(String email) {
        
        // Se declara la variable de sentencia SQL.
        String SQL = "";
                
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
        con.connect();
            
        if(firstSessionUser(email)){
            
            SQL = "UPDATE \"user\" SET \"firstSession\" = '" + new Date()
                + "' WHERE \"email\" = '" + email + "';";
            
            // Se realiza la inserción de datos.
            con.queryInsert(SQL);
            
            // Se muestra mensaje de éxito.
            System.out.println("La actualización del primer inicio del usuario "
                    + "cuyo correo es '" + email + "' se ha efectuado con éxito.");
            
        }
            
        SQL = "UPDATE \"user\" SET \"lastSession\" = '" + new Date()
            + "' WHERE \"email\" = '" + email + "';";        
        
        // Se realiza la inserción de datos.
        con.queryInsert(SQL);
        
        // Se muestra mensaje de éxito.
        System.out.println("La actualización del último inicio del usuario "
                + "cuyo correo es '" + email + "' se ha efectuado con éxito.");
          
        // Se desconecta la BD.
        con.disconnect();
    }
 
    /**
     * Método para consultar la información del empleado que se encuentra iniciando
     * sesión.
     * @param email Correo electrónico del usuario que está iniciando sesión
     * @return Retorna consulta.
     */
    public ResultSet getDataAccess(String email){
        
        // Se declara e instancia la variable con la sentencia SQL para la consulta.
        String SQL  = "SELECT \"name\", \"surname\", \"type\" FROM \"user\", "
                    + "\"employee\" WHERE \"email\" = '" + email + "' AND "
                    + "\"user\".\"state\" = 'A' AND \"employee\".\"state\" = 'A';";
        
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
        con.connect();
        
        // Se realiza y se recibe la consulta.
        ResultSet result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
    
}
