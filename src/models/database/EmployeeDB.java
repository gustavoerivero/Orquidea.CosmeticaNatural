
package models.database;

import lib.ConnectionDB;
import models.Employee;
import java.sql.ResultSet;

/**
 *
 * @author Gustavo
 */
public class EmployeeDB {
    
    private ConnectionDB con = new ConnectionDB();
    
    public EmployeeDB() {}
    
    public void registerEmployee(Employee employee) {
        
        con.connect();
        
        String SQL  = "INSERT INTO \"Employee\" "
                        + "(\"id\", \"Enterpriseid\", \"Userid\", \"dni\", "
                        + "\"name\", \"surname\", \"admissionDate\", \"birthday\", "
                        + "\"direction\", \"phone\", \"state\") "
                    + "VALUES ("
                        + "'" + employee.getId() + "' , "
                        + "'" + employee.getEnterpriseId() + "' , "
                        + "'" + employee.getUserId() + "' , "
                        + "'" + employee.getDni() + "' , "
                        + "'" + employee.getName() + "' , "
                        + "'" + employee.getSurname() + "' , "
                        + "'" + employee.getAdmissionDate() + "' , "
                        + "'" + employee.getBirthday() + "' , "
                        + "'" + employee.getDirection() + "' , "
                        + "'" + employee.getPhone() + "' , "
                        + "'" + employee.getState() + "');";
        
        con.queryInsert(SQL);
        
        con.disconnect();
        
    }
    
    /**
     * Método para obtener los datos de un empleado.
     * @param dni Documento Nacional de Identificación del empleado.
     * @return Devuelve consulta.
     */
    public ResultSet consultOneEmployeeFromDNI(String dni) {
                
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL = "SELECT * FROM \"Employee\" WHERE \"dni\" = '" + dni + 
                "' AND \"state\" = 'A';";
        
        // Se establece una conexión con la BD.
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
     * Método para obtener los datos de un empleado.
     * @param userId Atributo identificador del usuario del empleado.
     * @return Devuelve consulta.
     */
    public ResultSet consultOneEmployeeFromId(int userId) {
                
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL = "SELECT * FROM \"Employee\" WHERE \"Userid\" = '" + userId + 
                "' AND \"state\" = 'A';";
        
        // Se establece una conexión con la BD.
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
     * Método para obtener los datos de un empleado.
     * @param email Correo electrónico del empleado.
     * @return Devuelve consulta.
     */
    public ResultSet consultOneEmployeeFromEmail(String email) {
                
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL  = "SELECT \"Employee\".\"id\", \"Enterpriseid\", \"Userid\", "
                    + "\"dni\", \"name\", \"surname\", \"admissionDate\", "
                    + "\"birthday\", \"direction\", \"phone\", \"Employee\".\"state\" "
                    + "FROM \"Employee\", \"User\" WHERE \"Employee\".\"id\" = \"User\".\"id\" "
                    + "AND \"email\" = 'gustavoerivero12@gmail.com' AND "
                    + "\"Employee\".\"state\" = 'A' AND \"User\".\"state\" = 'A';";
    
        // Se establece una conexión con la BD.
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
     * Método para actualizar un empleado en la Base de Datos.
     * @param employee Empleado a actualizar.
     */
    public void updateEmployee(Employee employee) {
        
        con.connect(); 

        // Se describe la sentencia SQL.
        String SQL = "UPDATE \"Employee\" SET \"Enterpriseid\" = '" + employee.getEnterpriseId() + 
                    "', \"Userid\" = '" + employee.getUserId() + 
                    "', \"name\" = '" + employee.getName() + 
                    "', \"surname\" = '" + employee.getSurname() + 
                    "', \"admissionDate\" = '" + employee.getAdmissionDate() +
                    "', \"birthday\" = '" + employee.getBirthday() +
                    "', \"direction\" = '" + employee.getDirection() +
                    "', \"phone\" = '" + employee.getPhone() +
                    "', \"dni\" = '" + employee.getDni() +
                    "', \"state\" = '" + employee.getState() +
                    "' WHERE \"id\" = '" + employee.getId() + "';";
            
        con.queryInsert(SQL);
        
        System.out.println("Se ha actualizado el empleado " + employee.getName() +
                " " + employee.getSurname() + " con éxito.");
            
        // Se desconecta la BD.
        con.disconnect();
        
    }
    
}
