
package models;

/**
 * Clase de Proveedor.
 * @author Gustavo
 */
public class Provider {
    
    private int     id;
    
    private String  name,
                    description,
                    direction,
                    email;
    
    private long    phone;
    
    private char    state;

    /**
     * Constructor de la clase Proveedor.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre del proveedor.
     * @param description Descripción del proveedor.
     * @param direction Dirección del proveedor.
     * @param email Direción de correo electrónico del proveedor.
     * @param phone Teléfono del proveedor.
     * @param state Estado (Activo o Inactivo).
     */
    public Provider(int id, String name, String description, String direction, 
            String email, long phone, char state) {
        
        this.id = id;
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
