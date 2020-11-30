
package models.database;

import java.sql.ResultSet;
import lib.ConnectionDB;
import models.Notification;

/**
 *
 * @author Gustavo
 */
public class NotificationDB {
    
    private ConnectionDB con = new ConnectionDB();
    
    public NotificationDB() {}
    
    /**
     * Método para registrar en la base de datos una nueva notificación.
     * @param notification Clase Notificación.
     */
    public void createNotification(Notification notification) {
            
        con.connect();
        
        // Se desclara la sentencia SQL.
        String SQL = "INSERT INTO \"Notification\" (\"id\", \"name\", "
                    + "\"message\", \"type\", \"showUp\", \"state\") "
                    + "VALUES ("
                    + "'" + notification.getId() + "', "
                    + "'" + notification.getName() + "', "
                    + "'" + notification.getMessage() + "', "
                    + "'" + notification.getType() + "', "
                    + "'" + notification.getShowUp() + "', "
                    + "'" + notification.getState() + "'"
                    + ");";
    
        // Se insertan los datos en la BD.
        con.queryInsert(SQL);
        
        // Se muestra el mensaje de éxito.
        System.out.println("La notificación '" + notification.getName() + "' ha "
                + "sido registrada con éxito.");
     
        // Se desconecta la BD.
        con.disconnect();
        
    }
    
    /**
     * Método para enlazar una notificación a un usuario.
     * @param userId
     * @param notificationId
     */
    public void linkNotification(int userId, int notificationId) {
            
        con.connect();
        
        // Se desclara la sentencia SQL.
        String SQL = "INSERT INTO \"NotificationToUser\" (\"Userid\", \"Notificationid\", "
                    + "\"receivesDate\", \"viewed\") "
                    + "VALUES ("
                    + "'" + userId + "', "
                    + "'" + notificationId + "', "
                    + "'" + new java.util.Date() + "', "
                    + "'I'"
                    + ");";
    
        // Se insertan los datos en la BD.
        con.queryInsert(SQL);
        
        // Se muestra el mensaje de éxito.
        System.out.println("El usuario '" + userId + "' ha recibido la "
                + "notificación de id '" + notificationId + "' con éxito.");
     
        // Se desconecta la BD.
        con.disconnect();
        
    }
    
    /**
     * Método que permite crear una notificación en la Base de Datos y enlazarla a un usuario.
     * @param userId Atributo identificador del usuario al que se enlazará la notificación.
     * @param notification Notificación que será registrada y enlazada.
     */
    public void createAndLinkNotification(int userId, Notification notification) {
        
        createNotification(notification);
        linkNotification(userId, notification.getId());
        
    }
        
    /**
     * Método para consultar las últimas notificaciones de un usuario.
     * @param email Correo electrónico del usuario.
     * @param quantity Cantidad de notificaciones a consultar.
     * @return Consulta.
     */
    private ResultSet readLastNotifications(String email, int quantity) {
        
        ResultSet result;
        
        String SQL = "SELECT \"name\", \"message\", \"receivesDate\", \"viewed\" "
                + "FROM \"User\", \"Notification\", \"NotificationToUser\" WHERE "
                + "\"Notification\".\"id\" = \"Notificationid\" AND \"User\".\"id\""
                + " = \"Userid\" AND \"email\" = '" + email + "' AND "
                + "\"User\".\"state\" = 'A' AND \"Notification\".\"state\" = 'A' "
                + "ORDER BY \"Notification\".\"id\" DESC LIMIT " + quantity + ";";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Método para obtener un listado de las últimas notificaciones de un usuario.
     * @param email Correo electrónico del usuario.
     * @param quantity Cantidad de notificaciones a consultar.
     * @return Listado con las notificaciones.
     */
    public java.util.ArrayList<Object> lastNotifications(String email, int quantity) {
        
        java.util.ArrayList<Object> notifications = new java.util.ArrayList<>();
        
        ResultSet result;
        
        try {
            
            result = readLastNotifications(email, quantity);
                        
            while(result.next()){
                notifications.add(result.getString("viewed").charAt(0));
                notifications.add(result.getString("name"));
                notifications.add(result.getString("message"));
                notifications.add(result.getDate("receivesDate"));
            }
                                                                  
        } catch (java.sql.SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return notifications;
        
    }
    
    /**
     * Método para obtener las notificaciones de un usuario.
     * @param userId
     * @return Devuelve consulta.
     */
    public ResultSet readNotifications(int userId){
        
        // Se declara una variable de tipo 'ResultSet' para realizar la consulta.
        ResultSet result;
        
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL  = "SELECT \"Notification\".\"id\", \"name\", \"message\", "
                    + "\"receivesDate\", \"type\", \"viewed\", "
                    + "\"Notification\".\"state\" FROM \"Notification\", "
                    + "\"NotificationToUser\", \"User\" WHERE \"User\".\"id\" = '" 
                    + userId + "' AND \"User\".\"id\" = \"Userid\" AND "
                    + "\"User\".\"state\" = 'A' AND "
                    + "\"Notification\".\"state\" = 'A';";
        
        con.connect();
        
        // Se realiza y se recibe la consulta.
        result = con.queryConsult(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.disconnect();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Método para saber si el usuario tiene notificaciones por leer.
     * @param userId Atributo identificador del usuario.
     * @return Devuelve 'verdadero' si el usuario tiene notificaciones por leer, 
     * 'falso' para caso contrario.
     */
    public boolean unread(int userId){
        
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL  = "SELECT COUNT(\"Notificationid\") FROM \"NotificationToUser\", "
                    + "\"Notification\", \"User\" WHERE \"Userid\" = \"User\".\"id\" "
                    + "AND \"Notificationid\" = \"Notification\".\"id\" AND "
                    + "\"User\".\"state\" = 'A' AND \"Notification\".\"state\" = 'A' "
                    + "AND \"User\".\"id\" = " + userId + " AND \"viewed\" = 'I';";
        
        int count = -1;
        
        con.connect();
        
        ResultSet result = con.queryConsult(SQL);
        
        try {
            while(result.next()) 
                count = result.getInt("count");
            
        } catch (java.sql.SQLException ex) {
            System.out.println("Error en la lectura de notificaciones. Error: " + ex);
        }
        
        con.disconnect();
        
        if (count > 0) {
            System.out.println("El usuario de id '" + userId + "' tiene " + 
                    count + " notificaciones por leer.");
            return true;
        }
        
        System.out.println("El usuario de id '" + userId + "' no tiene notificaciones por leer.");
        return false;
                
    }
    
    /**
     * Método para que un usuario lea sus notificaciones.
     * @param userId Atributo identificador del usuario.
     */
    public void read(int userId) {
        
        String SQL = "UPDATE \"NotificationToUser\" SET \"viewed\" = 'A' WHERE \"Userid\" = '" + userId + "';";

        con.connect();

        con.queryInsert(SQL);

        con.disconnect();
        
        System.out.println("El usuario de id '" + userId + "' ha leído sus notificaciones.");
        
    }
        
}
