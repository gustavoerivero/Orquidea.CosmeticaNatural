
package models.database;

import lib.ConnectionDB;
import models.Enterprise;

/**
 *
 * @author Gustavo
 */
public class EnterpriseDB {
    
    private ConnectionDB con = new ConnectionDB();
    
    public EnterpriseDB(){}
    
    /**
     * Método para registrar en la base de datos una empresa.
     * @param enterprise Clase Empresa.
     */
    public void registerEnterprise(Enterprise enterprise) {
            
        con.connect();
          
        // Se desclara la sentencia SQL.
        String SQL = "INSERT INTO \"Enterprise\" (\"id\", \"dni\", "
                    + "\"name\", \"description\", \"direction\", \"phone\", "
                    + "\"email\", \"state\") "
                    + "VALUES ("
                    + "'" + enterprise.getId() + "', "
                    + "'" + enterprise.getDni() + "', "
                    + "'" + enterprise.getName() + "', "
                    + "'" + enterprise.getDescription() + "', "
                    + "'" + enterprise.getDirection() + "', "
                    + "'" + enterprise.getPhone() + "', "
                    + "'" + enterprise.getEmail() + "', "
                    + "'" + enterprise.getState() + "'"
                    + ");";
    
        // Se insertan los datos en la BD.
        con.queryInsert(SQL);
        
        // Se muestra el mensaje de éxito.
        System.out.println("La empresa \"" + enterprise.getName() + "\" se"
                + " ha registrado con éxito.");
     
        // Se desconecta la BD.
        con.disconnect();
                
    }
    
    /**
     * Método para eliminación de un registro de Empresa buscado por campo 'id'.
     * @param id De la empresa que se desea eliminar.
     */
    public void deleteEnterprise(int id) {
        
        // Se declara la variable de sentencia SQL.
        String SQL = "DELETE FROM \"Enterprise\" WHERE \"id\" = '" + id + "';";
                
        con.connect();
        
        // Se realiza y se recibe la consulta.
        con.queryInsert(SQL);
        
        // Se muestra mensaje de éxito.
        System.out.println("La eliminación de la empresa se ha efectuado con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
                
    }
    
    /**
     * Eliminación o reactivación lógica de una empresa.
     * @param id Campo identificador de la empresa.
     * @param type Indica si se eliminará o reactivará la empresa: '0' para 
     * eliminación y '1' para reactivación.
     */
    public void deleteEnterprise(int id, char type) {
        
        // Se declara la variable de sentencia SQL.
        String SQL = "UPDATE \"Enterprise\" SET \"estatus\" = '" + type + "' "
                   + "WHERE \"id\" = '" + id + "';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        con.queryInsert(SQL);
        
        // Se muestra mensaje de éxito.
        System.out.println("La eliminación de la empresa se ha efectuado con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
                
    }
    
}
