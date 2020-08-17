
package models;

import java.util.Date;

/**
 * Clase de Empleado.
 * @author Gustavo
 */
public class Employee extends Person{
    
    private int     enterpriseId;
    
    private String  dni;

    /**
     * Constructor de la clase Empleado.
     * @param id Atributo identificador (Autoincrementable).
     * @param enterpriseId Atributo identificador de la empresa.
     * @param name Nombre del empleado.
     * @param surname Apellido del empleado.
     * @param birthday Cumpleaños del empleado.
     * @param phone Teléfono del empleado.
     * @param direction Dirección del empleado.
     * @param email Correo electrónico del empleado.
     * @param state Estado (Activo o Inactivo).
     * @param dni Documento Nacional de Identidad del empleado.
     */
    public Employee(int id, int enterpriseId, String name, String surname, 
            Date birthday, long phone, String direction, String email, char state,
            String dni) {
        
        super(id, name, surname, birthday, phone, direction, email, state);
        
        this.enterpriseId = enterpriseId;
        this.dni = dni;
        
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
