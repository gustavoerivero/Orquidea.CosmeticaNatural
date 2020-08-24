
package models;

/**
 * Clase de Notificación.
 * @author Gustavo
 */
public class Notification {
    
    private int     id;
    
    private String  name,
                    message;
    
    private char    showUp,
                    type,
                    state;

    /**
     * Constructor de la clase Notificación.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre de la notifiación,
     * @param message Mensaje de la notificación.
     * @param showUp Mensaje mostrado.
     * @param type Tipo de mensaje.
     * @param state Estado (Activo o Inactivo).
     */
    public Notification(int id, String name, String message, char showUp,
            char type, char state) {
        
        this.id = id;
        this.name = name;
        this.message = message;
        this.showUp = showUp;
        this.type = type;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public char getShowUp() {
        return showUp;
    }

    public void setShowUp(char showUp) {
        this.showUp = showUp;
    }
    
    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
