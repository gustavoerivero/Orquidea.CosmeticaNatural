
package models;

/**
 *
 * @author Gustavo
 */
public class EnterpriseColorMode extends ColorMode{
    
    private int     enterpriseSettingsId;

    /**
     * Constructor de la clase de Modo de Color de Empresa.
     * @param id Atributo identificador (Autoincrementable).
     * @param enterpriseSettingsId Atributo identificador de la configuración 
     * de la empresa.
     * @param red Valor numérico de la escala 'red'.
     * @param green Valor numérico de la escala 'green'.
     * @param blue Valor numérico de la escala 'blue'.
     * @param name Nombre del Modo de Color de Empresa.
     * @param description Descripción del Modo de Color de Empresa.
     * @param type Tipo del Modo de Color de Empresa.
     * @param status Estado del Modo de COlor de Empresa.
     */
    public EnterpriseColorMode(int id, int enterpriseSettingsId, int red, 
            int green, int blue, String name, String description, char type, 
            char status) {
        
        super(id, red, green, blue, name, description, type, status);
    
        this.enterpriseSettingsId = enterpriseSettingsId;
        
    }

    public int getEnterpriseSettingsId() {
        return enterpriseSettingsId;
    }

    public void setEnterpriseSettingsId(int enterpriseSettingsId) {
        this.enterpriseSettingsId = enterpriseSettingsId;
    }
        
}
