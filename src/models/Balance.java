
package models;

/**
 * Clase del Saldo de una Billetera.
 * @author Gustavo
 */
public class Balance {
    
    private int     id,
                    walletId;
    
    private String  name;
    
    private double  amount;
    
    private char    type,
                    state;

    /**
     * Constructor de la clase Saldo.
     * @param id Atributo identificador (Autoincrementable).
     * @param walletId Atributo identificador de la billetera.
     * @param name
     * @param amount
     * @param type
     * @param state 
     */
    public Balance(int id, int walletId, String name, double amount, 
            char type, char state) {
        
        this.id = id;
        this.walletId = walletId;
        this.name = name;
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

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
