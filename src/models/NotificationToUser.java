
package models;

import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class NotificationToUser {
    
    private String  userEmail;
    
    private int     notificationId;
    
    private Date    receivesDate;

    /**
     * Constructor de la clase de Notificaciones al usuario.
     * @param userEmail Correo electrónico del usuario.
     * @param notificationId Atributo identificador de la notificación.
     * @param receivesDate Fecha de recepción.
     */
    public NotificationToUser(String userEmail, int notificationId, 
            Date receivesDate) {
        
        this.userEmail = userEmail;
        this.notificationId = notificationId;
        this.receivesDate = receivesDate;
        
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Date getReceivesDate() {
        return receivesDate;
    }

    public void setReceivesDate(Date receivesDate) {
        this.receivesDate = receivesDate;
    }

}
