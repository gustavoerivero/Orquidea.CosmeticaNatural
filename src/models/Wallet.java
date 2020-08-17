
package models;

/**
 * Clase de la billetera virtual.
 * @author Gustavo
 */
public class Wallet {
    
    private int     id,
                    enterpriseId;
    
    private String  name,
                    description;
    
    private double  amount;
    
    private char    state;

    /**
     * Constructor de la billetera virtual.
     * @param id Atributo identificador (autoincrementable).
     * @param enterpriseId Atributo identificador de la empresa.
     * @param name Nombre de la billetera.
     * @param description Descripción de la billetera.
     * @param amount Monto de la billetera.
     * @param state Estado de la billetera.
     */
    public Wallet(int id, int enterpriseId, String name, 
            String description, double amount, char state) {
        
        this.id = id;
        this.enterpriseId = enterpriseId;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
    
}
