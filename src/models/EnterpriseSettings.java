
package models;

import java.awt.Image;

/**
 *
 * @author Gustavo
 */
public class EnterpriseSettings {
    
    private int     enterpriseId;
    
    private Image   photo;
    
    private char    darkMode,
                    changeColorPermission,
                    changeDataUserPermission,
                    changeNotifyPermission;

    /**
     * Constructor de la clase de Configuraciones para la Empresa.
     * @param enterpriseId Atributo identificador de la clase.
     * @param photo Imagen de la Empresa (Logo).
     * @param darkMode Modo Oscuro.
     * @param changeColorPermission Permiso para el cambio de color de la aplicación.
     * @param changeDataUserPermission Permiso para el cambio de datos de los usuarios.
     * @param changeNotifyPermission Permiso para las opciones de notificaciones.
     */
    public EnterpriseSettings(int enterpriseId, Image photo, char darkMode, 
            char changeColorPermission, char changeDataUserPermission, 
            char changeNotifyPermission) {
        
        this.enterpriseId = enterpriseId;
        this.photo = photo;
        this.darkMode = darkMode;
        this.changeColorPermission = changeColorPermission;
        this.changeDataUserPermission = changeDataUserPermission;
        this.changeNotifyPermission = changeNotifyPermission;
    
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public char getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(char darkMode) {
        this.darkMode = darkMode;
    }

    public char getChangeColorPermission() {
        return changeColorPermission;
    }

    public void setChangeColorPermission(char changeColorPermission) {
        this.changeColorPermission = changeColorPermission;
    }

    public char getChangeDataUserPermission() {
        return changeDataUserPermission;
    }

    public void setChangeDataUserPermission(char changeDataUserPermission) {
        this.changeDataUserPermission = changeDataUserPermission;
    }

    public char getChangeNotifyPermission() {
        return changeNotifyPermission;
    }

    public void setChangeNotifyPermission(char changeNotifyPermission) {
        this.changeNotifyPermission = changeNotifyPermission;
    }
        
}
