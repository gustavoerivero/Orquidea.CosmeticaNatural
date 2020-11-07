
package lib.NotificationPanel;

import java.text.ParseException;

/**
 *
 * @author Gustavo
 */
public class NotificationPanel {
    
    PanelGUI panel;
    
    /**
     * Constructor del panel de notificaciones.
     * @param parent JFrame padre.
     * @param notifications Listado de notificaciones. 
     * Debe ser uns listado de objeto compuesto por: 
     * 1. (String) Nombre de la notificación. 
     * 2. (String) Mensaje de la notificación. 
     * 3. (char) Indicador si el mensaje ha sido visto o no.
     * 4. (Date) Fecha de la notificación.
     */
    public NotificationPanel(java.awt.Frame parent, java.util.ArrayList<Object> notifications) throws ParseException {
        
        panel = new PanelGUI(parent, true, notifications);
        
    }
    
    
}
