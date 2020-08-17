
package models;

/**
 * Clase padre para cuentas bancarias.
 * @author Gustavo
 */
public class BankAccount {
    
    private int     id,
                    ownerId;
    
    private String  dni,
                    name,
                    bank,
                    email;
    
    private long    account,
                    phone;
    
    private char    state;

    /**
     * Constructor de la clase BankAccount
     * @param id Atributo identificador (Autoincrementable).
     * @param ownerId Atributo identificador del propietario de la cuenta.
     * @param dni Documento Nacional de Identidad del propietario de la cuenta.
     * @param name Nombre asociado a la cuenta.
     * @param bank Banco asociado a la cuenta.
     * @param email Correo electrónico asociado a la cuenta.
     * @param account Número de cuenta bancaria.
     * @param phone Teléfono asociado a la cuenta.
     * @param state Estado (Activo o Inactivo).
     */
    public BankAccount(int id, int ownerId, String dni, String name, 
            String bank, String email, long account, long phone, char state) {
        
        super();
        
        this.id = id;
        this.ownerId = ownerId;
        this.dni = dni;
        this.name = name;
        this.bank = bank;
        this.email = email;
        this.account = account;
        this.phone = phone;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
