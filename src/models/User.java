
package models;

import java.util.Date;
import javax.swing.Icon;

/**
 * Clase de Usuario.
 * @author Gustavo
 */
public class User {
    
    private int     id,
                    userTypeId;
    
    private String  email,
                    password;
    
    private char    rememberData,
                    state;
    
    private Date    firstSession,
                    lastSession;
    
    private Icon    photo;
    
    public User() {}
    
    /**
     * Constructor de la clase Usuario.
     * @param id Atributo identificador (Autoincrementable).
     * @param userTypeId Atributo identificador del Tipo de Usuario.
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param type Tipo de usuario.
     * @param state Estado (Activo o Inactivo).
     * @param firstSession Primer inicio de sesión del usuario.
     * @param lastSession Último inicio de sesión del usuario.
     * @param photo Foto del usuario.
     */
    public User(int id, int userTypeId, String email, String password,
            char rememberData, char state, Date firstSession, Date lastSession,
            Icon photo) {
        
        this.id = id;
        this.userTypeId = userTypeId;
        this.email = email;
        this.password = password;
        this.rememberData = rememberData;
        this.state = state;
        this.firstSession = firstSession;
        this.lastSession = lastSession;
        this.photo = photo;
        
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
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

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }
        
}
