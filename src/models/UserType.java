
package models;

/**
 *
 * @author Gustavo
 */
public class UserType {
    
    private int     id;
    
    private String  name,
                    description;
    
    private char    status;

    /**
     * Constructor de la clase Tipo de Usuario.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre del tipo de usuario.
     * @param description Descripción del tipo de usuario.
     * @param status Estado del tipo de usuario.
     */
    public UserType(int id, String name, String description, char status) {
        
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        
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

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
}
