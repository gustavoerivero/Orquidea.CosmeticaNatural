
package models;

import java.util.Date;

/**
 * Clase de Usuario.
 * @author Gustavo
 */
public class User {
    
    private int     id;
    
    private String  email,
                    password;
    
    private char    type,
                    rememberData,
                    state;
    
    private Date    firstSession,
                    lastSession;

    /**
     * Constructor de la clase Usuario.
     * @param id Atributo identificador (Autoincrementable).
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param type Tipo de usuario.
     * @param rememberData Se recuerda la información del usuario.
     * @param state Estado (Activo o Inactivo).
     * @param firstSession Primer inicio de sesión del usuario.
     * @param lastSession Último inicio de sesión del usuario.
     */
    public User(int id, String email, String password, char type, 
            char rememberData, char state, Date firstSession, Date lastSession) {
        
        this.id = id;
        this.email = email;
        this.password = password;
        this.type = type;
        this.rememberData = rememberData;
        this.state = state;
        this.firstSession = firstSession;
        this.lastSession = lastSession;
        
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getRememberData() {
        return rememberData;
    }

    public void setRememberData(char rememberData) {
        this.rememberData = rememberData;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public Date getFirstSession() {
        return firstSession;
    }

    public void setFirstSession(Date firstSession) {
        this.firstSession = firstSession;
    }

    public Date getLastSession() {
        return lastSession;
    }

    public void setLastSession(Date lastSession) {
        this.lastSession = lastSession;
    }
        
}
