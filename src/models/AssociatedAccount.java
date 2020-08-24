
package models;

/**
 *
 * @author Gustavo
 */
public class AssociatedAccount {
    
    private int enterpriseAccountBankId,
                enterpriseWalletId;

    /**
     * Constructor de clase de Cuenta Asociada.
     * @param enterpriseAccountBankId Atributo identificador de la cuenta bancaria.
     * @param enterpriseWalletId Atributo identificador de la billetera.
     */
    public AssociatedAccount(int enterpriseAccountBankId, int enterpriseWalletId) {
        
        this.enterpriseAccountBankId = enterpriseAccountBankId;
        this.enterpriseWalletId = enterpriseWalletId;
        
    }

    public int getEnterpriseAccountBankId() {
        return enterpriseAccountBankId;
    }

    public void setEnterpriseAccountBankId(int enterpriseAccountBankId) {
        this.enterpriseAccountBankId = enterpriseAccountBankId;
    }

    public int getEnterpriseWalletId() {
        return enterpriseWalletId;
    }

    public void setEnterpriseWalletId(int enterpriseWalletId) {
        this.enterpriseWalletId = enterpriseWalletId;
    }
        
}
