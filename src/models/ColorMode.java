
package models;

/**
 *
 * @author Gustavo
 */
public class ColorMode {
    
    private int     id,
                    red,
                    green,
                    blue;
    
    private String  name,
                    description;
    
    private char    type,
                    status;

    /**
     * Constructor de la clase de Modo de Color.
     * @param id Atributo identificador (Autoincrementable).
     * @param red Valor numérico de la escala 'red'.
     * @param green Valor numérico de la escala 'green'.
     * @param blue Valor numérico de la escala 'blue'.
     * @param name Nombre del modo.
     * @param description Descripción del modo.
     * @param type Tipo del modo.
     * @param status Estado del modo.
     */
    public ColorMode(int id, int red, int green, int blue, String name, 
            String description, char type, char status) {
        
        super();
        
        this.id = id;
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
        this.description = description;
        this.type = type;
        this.status = status;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
            
}
