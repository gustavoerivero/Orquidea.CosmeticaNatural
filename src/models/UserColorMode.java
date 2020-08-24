
package models;

/**
 *
 * @author Gustavo
 */
public class UserColorMode extends ColorMode{
    
    private int     userSettingsId;

    /**
     * Constructor de la clase de Modo de Color de Usuario.
     * @param userSettingsId Atributo identificador de las configuraciones del
     * usuario.
     * @param id Atributo identificador (Autoincrementable).
     * @param red Valor numérico de la escala 'red'.
     * @param green Valor numérico de la escala 'green'.
     * @param blue Valor numérico de la escala 'blue'.
     * @param name Nombre del modo.
     * @param description Descripción del modo.
     * @param type Tipo del modo.
     * @param status Estado del modo.
     */
    public UserColorMode(int userSettingsId, int id, int red, int green, 
            int blue, String name, String description, char type, char status) {
        
        super(id, red, green, blue, name, description, type, status);
        
        this.userSettingsId = userSettingsId;
        
    }    

    public int getUserSettingsId() {
        return userSettingsId;
    }

    public void setUserSettingsId(int userSettingsId) {
        this.userSettingsId = userSettingsId;
    }
        
}
