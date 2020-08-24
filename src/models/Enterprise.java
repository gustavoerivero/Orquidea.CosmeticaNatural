
package models;

/**
 * Clase de Empresa
 * @author Gustavo
 */
public class Enterprise {
    
    private int     id;
    
    private String  dni,
                    name,
                    description,
                    direction,
                    email;
    
    private long    phone;
        
    private char    state;

    /**
     * Constructor de la clase Empresa.
     * @param id Atributo identificador (Autoincrementable).
     * @param dni DNI de la Empresa.
     * @param name Nombre de la Empresa.
     * @param description Descripción de la Empresa.
     * @param direction Dirección de la Empresa.
     * @param email Correo electrónico de la Empresa.
     * @param phone Teléfono de la Empresa.
     * @param state Estado (Activo o Inactivo).
     */
    public Enterprise(int id, String dni, String name, String description, 
            String direction, String email, long phone, char state) {
        
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.description = description;
        this.direction = direction;
        this.email = email;
        this.phone = phone;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
