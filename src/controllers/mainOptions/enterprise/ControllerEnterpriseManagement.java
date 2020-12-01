
package controllers.mainOptions.enterprise;

import models.User;
import models.Enterprise;
import models.Notification;
import models.database.NotificationDB;
import models.database.EnterpriseDB;
import models.database.UserDB;

import views.MainMenu;
import views.mainOptions.enterprise.EnterpriseManagement;

import views.PopupMessage;
import views.SelectOption;
import lib.ConnectionDB;
import lib.Mail;
import lib.SupportFunctions;

/**
 *
 * @author Gustavo
 */
public class ControllerEnterpriseManagement implements java.awt.event.ActionListener {
    
    private User                    user;
    private Enterprise              enterprise;
    private Notification            notification;
    private NotificationDB          notificationDB;
    private EnterpriseDB            enterpriseDB;
    private UserDB                  userDB;
    
    private MainMenu                main;
    private EnterpriseManagement    enterpriseView;
    
    private PopupMessage            popup;
    private SelectOption            select;
    private ConnectionDB            con;
    private Mail                    mail;
    private SupportFunctions        support;
    
    public ControllerEnterpriseManagement(MainMenu main, User user) {
        
        this.main       = main;
        this.user       = user;
        
        mail            = new Mail("caelestidevelopment@gmail.com", "tavo9712pipox");
        support         = new SupportFunctions();
        enterpriseDB    = new EnterpriseDB();
        notificationDB  = new NotificationDB();
        userDB          = new UserDB();
        
        enterpriseView  = new EnterpriseManagement();
        
        enterprise = readEnterpriseData();
        
        setEnterpriseData(enterprise);
        userPermits(this.user.getUserTypeId());
        
        enterpriseView.addActionEvents(this);
                
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
            
        //<editor-fold defaultstate="collapsed" desc=" Botones de la Barra Superior ">
        
        // Minimizar aplicación.
        if(evt.getSource() == enterpriseView.btnMin){
            enterpriseView.setExtendedState(java.awt.Frame.ICONIFIED);
            enterpriseView.btnMin.setBackground(new java.awt.Color(255,245,249));
        } 
        
        // Salir de la aplicación.
        else if(evt.getSource() == enterpriseView.btnExit){
            main.notifications(user.getId());
            enterpriseView.dispose();
        } 

        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Botones ">
        
        // Cerrar ventana.
        else if(evt.getSource() == enterpriseView.btnClose) {
            
            main.notifications(user.getId());
            enterpriseView.dispose();
            
        }
        
        // Limpiar datos agregados.
        else if(evt.getSource() == enterpriseView.btnClearData) {
            
            setEnterpriseData(enterprise);
            
        }
        
        // Actualizar datos.
        else if(evt.getSource() == enterpriseView.btnUpdateData) {
            
            Enterprise supportEnterprise = new Enterprise(enterprise.getId(),
                    enterpriseView.txtDNI.getText(), 
                    enterpriseView.txtName.getText(), 
                    enterpriseView.txtDescription.getText(), 
                    enterpriseView.txtDirection.getText(), 
                    enterpriseView.txtEmail.getText(),
                    Long.valueOf(enterpriseView.txtPhone.getText()),
                    enterprise.getState()
            );
            
            if(!enterprise.equals(supportEnterprise)) {
                
                select = new SelectOption(
                        main, 
                        true, 
                        10, 
                        "¿Desea actualizar los datos de la empresa?", 
                        "Si", 
                        "No"
                );
                
                if(select.getOpc()) {
                    
                    con = new ConnectionDB();
                    
                    int count = con.count("User");
                    
                    enterpriseDB.updateEnterprise(supportEnterprise);
                    
                    popup = new PopupMessage(
                            main, 
                            true, 
                            15, 
                            "Los datos de la empresa han sido actualizados con éxito."
                    );
                    
                    notification = new Notification(new lib.ConnectionDB().next("Notification"),
                            "Datos de la empresa actualizados " + new java.util.Date(), 
                            "Se han actualizado los datos de la empresa " +
                                    supportEnterprise.getName() + " el "
                                    + new java.util.Date() + ".",
                            'A',
                            0,
                            'A'
                    );
                    
                    // Se crea la notificación aparte para enlazarla a cada uno de los usuarios en el ciclo.
                    notificationDB.createNotification(notification);
                    
                    for(int i = 0; i < count; i++) {
                        
                        java.util.ArrayList<User> userList = userDB.getAllUsers();
                        
                        // Se enlaza la notificación a cada uno de los usuarios activos en la empresa.
                        notificationDB.linkNotification(userList.get(i).getId(), notification.getId());
                        
                        mail.sendMessage(
                                userList.get(i).getEmail(), 
                                notification.getName(), 
                                notification.getMessage()
                        );
                        
                    }
                 
                    main.notifications(user.getId());
                    
                    enterprise = supportEnterprise;
                    
                }
                
            }
            
        }
        
        //</editor-fold>
    
    }
            
    /**
     * Método para consultar la información de una empresa.
     * @return Empresa consultada.
     */
    private Enterprise readEnterpriseData() {
        
        // Se instancia la clase a utilizar.
        enterpriseDB = new EnterpriseDB();
        
        Enterprise supportEnterprise = null;
        
        // Se declara la variable que devuelve el resultado.
        java.sql.ResultSet result;
                
        try {
            
            result = enterpriseDB.consultEnterprise();
            
            while(result.next()){
                supportEnterprise = new Enterprise(
                        result.getInt("id"),
                        result.getString("dni"),
                        result.getString("name"),
                        result.getString("description"),
                        result.getString("direction"),
                        result.getString("email"), 
                        result.getLong("phone"),
                        result.getString("state").charAt(0)
                );
            }
                                    
            System.out.println("Éxito.");
            
            return supportEnterprise;
                                    
        } catch (java.sql.SQLException ex) {
            System.out.println("Error: " + ex);
        }
        
        return null;
        
    }
    
    /**
     * Método para colocar los datos de la empresa en la view.
     * @param supportEnterprise Objeto de tipo Empresa que proporciona los datos.
     */
    private void setEnterpriseData(Enterprise supportEnterprise) {
                
        enterpriseView.txtDNI.setText(supportEnterprise.getDni());
        enterpriseView.txtName.setText(supportEnterprise.getName());
        enterpriseView.txtPhone.setText(String.valueOf(supportEnterprise.getPhone()));
        enterpriseView.txtEmail.setText(supportEnterprise.getEmail());
        enterpriseView.txtDescription.setText(supportEnterprise.getDescription());
        enterpriseView.txtDirection.setText(supportEnterprise.getDirection());
        
    }
    
    /**
     * Método para permitir al usuario modificar información dependiendo del 
     * tipo de usuario.
     * @param type Tipo de usuario.
     */
    private void userPermits(int type){
        
        if(type != 0) {
            
            enterpriseView.txtDNI.setEditable(false);
            enterpriseView.txtName.setEditable(false);
            enterpriseView.txtPhone.setEditable(false);
            enterpriseView.txtEmail.setEditable(false);
            enterpriseView.txtDescription.setEditable(false);
            enterpriseView.txtDirection.setEditable(false);
            
            enterpriseView.btnClearData.setEnabled(false);
            enterpriseView.btnUpdateData.setEnabled(false);
            
        } else if(type == 0) {
            
            enterpriseView.txtDNI.setEditable(true);
            enterpriseView.txtName.setEditable(true);
            enterpriseView.txtPhone.setEditable(true);
            enterpriseView.txtEmail.setEditable(true);
            enterpriseView.txtDescription.setEditable(true);
            enterpriseView.txtDirection.setEditable(true);
            
            enterpriseView.btnClearData.setEnabled(true);
            enterpriseView.btnUpdateData.setEnabled(true);
            
        }
        
    }
    
}
