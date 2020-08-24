
package lib;

// Se importan las librerías a utilizar.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase para la conexión de la Base de Datos.
 * @author Gustavo
 */
public class ConnectionDB {
    
    // Se declaran las variables que indican la Base de Datos, el usuario y la contraseña.
    private final String    info = "jdbc: sqlite: data.db",
                            clss = "org.sqlite.JDBC";
    
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
            Class.forName(clss);
            //Nos permitira abrir una conexion a nuestra Base de Datos.
            con = DriverManager.getConnection(info);
            System.out.println("La conexión con la Base de Datos se realizó correctamente.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Fallo al conectar " + e.getMessage());
        }
        return con;
    }
    
    /**
     * Método para realizar consultas con la Base de Datos.
     * @param sql Sentencia SQL para consultas.
     * @return 
     */
    public ResultSet queryConsult(String sql){
        try {
            //Nos permitira realizar sentencias sobre la Base de Datos
            java.sql.Statement ejecutionQuery = con.createStatement();
            //Variable que nos ayudara a realizar consultas a la Base de Datos
            ResultSet r = ejecutionQuery.executeQuery(sql);
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
     * @param sql Sentencia SQL para inserciones o modificaciones.
     */
    public void queryInsert(String sql){
        try {
            java.sql.Statement sentencia = con.createStatement();
            sentencia.executeUpdate(sql);
            System.out.println("Se ha Insertado/Modificado un registro.");

            
        } catch (Exception e) {
         
            System.out.println(e.getMessage());

        }
    }
    
    /**
     * Método para verificar si existe información en una tabla de la Base de Datos.
     * @param data Tabla que se va a evaluar.
     * @return Devuelve valor integer; Si devuelve '-1' la tabla no tiene información, 
     * pero si devuelve un valor distinto a '-1' quiere decir que la tabla sí tiene información.
     */
    public int dataExist(String data){
        
        // Se declara e inicializa la variable identificadora.
        int id = -1;
        
        try{
            
            connect();
          
            // Se declara una sentencia SQL.
            String SQL = "SELECT \"id\" FROM \"" + data + "\";";
            
            // Se realiza la consulta y se obtiene el resultado.
            ResultSet rs = queryConsult(SQL);
            
            // Se desconecta la BD.
            disconnect();
            
            // Si existe información.
            if(rs.next())
                while(rs.next())
                   id = rs.getInt("id");
                 
            // Si no existe información.
            else
                return id;
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar información. Error: " + ex);
        }
        
        // Devuelve el id.
        return id;
        
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
            System.out.println("Fallo al desconectar. Error: "+ e.getMessage());
        }
    }
    
}



