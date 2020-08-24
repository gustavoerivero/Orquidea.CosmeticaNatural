
package models;

/**
 * Clase del Saldo de una Billetera.
 * @author Gustavo
 */
public class Balance {
    
    private int     id,
                    enterpriseWalletId;
    
    private String  name;
    
    private double  percentage,
                    amount;
    
    private char    type,
                    state;

    /**
     * Constructor de la clase Saldo.
     * @param id Atributo identificador (Autoincrementable).
     * @param enterpriseWalletId Atributo identificador de la billetera.
     * @param name
     * @param percentage
     * @param amount
     * @param type
     * @param state 
     */
    public Balance(int id, int enterpriseWalletId, String name, double amount, 
            char type, char state) {
        
        this.id = id;
        this.enterpriseWalletId = enterpriseWalletId;
        this.name = name;
        this.percentage = percentage;
        this.amount = amount;
        this.type = type;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseWalletId() {
        return enterpriseWalletId;
    }

    public void setEnterpriseWalletId(int enterpriseWalletId) {
        this.enterpriseWalletId = enterpriseWalletId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
