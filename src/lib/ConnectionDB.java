
package lib;

// Se importan las librerías a utilizar.
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * Clase para la conexión de la Base de Datos.
 * @author Gustavo
 */
public class ConnectionDB {
    
    // Se declaran las variables que indican la Base de Datos, el usuario y la contraseña.
    private final String url = "jdbc:postgresql://localhost:5432/Orquidea",
                        user = "postgres",
                        pass = "1234";
    
    // Se instancia la clase de Connection.
    private Connection con;
    
    /**
     * Constructor.
     */
    public ConnectionDB(){
        this.con = null;
    }
        
    /**
     * Método para conectar la app con la Base de Datos.
     * @return 
     */
    public Connection connect(){
        try {
            //Nos permitira abrir una conexion a nuestra Base de Datos.
            con = java.sql.DriverManager.getConnection(url, user, pass);
            System.out.println("La conexión con la Base de Datos se realizó correctamente.");
        } catch (Exception e) {
            System.out.println("Fallo al conectar " + e.getMessage());
        }
        return con;
    }
    
    /**
     * Método para realizar consultas con la Base de Datos.
     * @param SQL Sentencia SQL para consultas.
     * @return 
     */
    public ResultSet queryConsult(String SQL){
        try {
            //Nos permitira realizar sentencias sobre la Base de Datos
            java.sql.Statement ejecutorQuery = con.createStatement();
            //Variable que nos ayudara a realizar consultas a la Base de Datos
            ResultSet r = ejecutorQuery.executeQuery(SQL);
            System.out.println("Se han obtenido datos.");
            return r;
            
        } catch (Exception e) {
            System.out.println("Conexion Informa: No se pudieron obtener los datos " 
                    + e.getMessage());
            return null;
        }
    }
    
    /**
     * Método para realizar inserciones o modificaciones con la Base de Datos.
     * @param SQL Sentencia SQL para inserciones o modificaciones.
     */
    public void queryInsert(String SQL){
        try {
            java.sql.Statement sentencia = con.createStatement();
            sentencia.executeUpdate(SQL);
            System.out.println("Se ha Insertado/Modificado un registro.");

            
        } catch (Exception e) {
         
            System.out.println(e.getMessage());

        }
    }
    
    /**
     * Método para verificar si existe información en una tabla de la Base de Datos.
     * @param data Tabla que se va a evaluar.
     * @return Devuelve 'verdadero' si existe al menos un valor en la tabla mencionada, 
     * 'falso' para caso contrario.
     */
    public boolean dataExist(String data){
                
        try{
            
            connect();
          
            // Se declara una sentencia SQL.
            String SQL = "SELECT COUNT('id') FROM \"" + data + "\";";
            
            // Se realiza la consulta y se obtiene el resultado.
            ResultSet rs = queryConsult(SQL);
                     
            // Se desconecta la BD.
            disconnect();
            
            // Si existe información.
            return rs.next();
                                                    
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar información. Error: " + ex);
        }
        
        return false;
        
    }
    
    /**
     * Método para conocer el siguiente registro que se va a añadir en una tabla de la Base de Datos.
     * @param data Tabla que se va a evaluar.
     * @return Devuelve el número que identificará el siguiente registro a añadir.
     */
    public int next(String data){
        
        // Se declara e inicializa la variable identificadora.
        int count = 0;
        
        try{
            
            connect();
          
            // Se declara una sentencia SQL.
            String SQL = "SELECT COUNT('id') FROM \"" + data + "\";";
            
            // Se realiza la consulta y se obtiene el resultado.
            ResultSet rs = queryConsult(SQL);
                        
            // Si existe información.
            while(rs.next())
                count = rs.getInt("count");
                        
            System.out.println("Existe(n) " + count + " registro(s) en " + data + " actualmente.");
            
            // Se desconecta la BD.
            disconnect();
                            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar información. Error: " + ex);
        }
        
        return count;
        
    }
    
    /**
     * Método para desconectar la Base de Datos de la app.
     */
    public void disconnect(){
        try {
            //Para realizar cierre de la conexion a la Base de Datos
            con.close();
            System.out.println("Exito al Desconectar la Base de Datos.");
        } catch (Exception e) {
            System.out.println("Fallo al desconectar Error: "+ e.getMessage());
        }
    }
    
}



