
package models;

/**
 * Clase de Notificación.
 * @author Gustavo
 */
public class Notification {
    
    private int     id;
    
    private String  message;
    
    private char    showUp,
                    type,
                    state;

    /**
     * Constructor de la clase Notificación.
     * @param id Atributo identificador (Autoincrementable).
     * @param message Mensaje de la notificación.
     * @param showUp Mensaje mostrado.
     * @param type Tipo de mensaje.
     * @param state Estado (Activo o Inactivo).
     */
    public Notification(int id, String message, char showUp,
            char type, char state) {
        
        this.id = id;
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
