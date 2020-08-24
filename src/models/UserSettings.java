
package models;

/**
 *
 * @author Gustavo
 */
public class UserSettings {
    
    private String  userEmail;
    
    private char    darkMode,
                    changeUserData,
                    emailNotify;

    /**
     * Consturctor de la clase de configuraciones del usuario.
     * @param userEmail Correo electrónico del usuario.
     * @param darkMode Modo oscuro.
     * @param changeUserData Cambios de datos del usuario.
     * @param emailNotify Notificaciones al correo.
     */
    public UserSettings(String userEmail, char darkMode, char changeUserData, 
            char emailNotify) {
        
        this.userEmail = userEmail;
        this.darkMode = darkMode;
        this.changeUserData = changeUserData;
        this.emailNotify = emailNotify;
        
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public char getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(char darkMode) {
        this.darkMode = darkMode;
    }

    public char getChangeUserData() {
        return changeUserData;
    }

    public void setChangeUserData(char changeUserData) {
        this.changeUserData = changeUserData;
    }

    public char getEmailNotify() {
        return emailNotify;
    }

    public void setEmailNotify(char emailNotify) {
        this.emailNotify = emailNotify;
    }
    
}
