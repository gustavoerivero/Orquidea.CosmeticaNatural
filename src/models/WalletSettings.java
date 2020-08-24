
package models;

/**
 *
 * @author Gustavo
 */
public class WalletSettings {
    
    private int     enterpriseWalletId;
    
    private char    fixedExpensesAmount,
                    incomesAmount,
                    purchaseAmount;

    /**
     * Constructor de la clase de Configuraciones de la Billetera.
     * @param enterpriseWalletId Atributo identificador de la Billetera.
     * @param fixedExpensesAmount Monto de Gastos Fijos.
     * @param incomesAmount Monto de Ingresos.
     * @param purchaseAmount Monto de Compras.
     */
    public WalletSettings(int enterpriseWalletId, char fixedExpensesAmount, 
            char incomesAmount, char purchaseAmount) {
        
        this.enterpriseWalletId = enterpriseWalletId;
        this.fixedExpensesAmount = fixedExpensesAmount;
        this.incomesAmount = incomesAmount;
        this.purchaseAmount = purchaseAmount;
        
    }

    public int getEnterpriseWalletId() {
        return enterpriseWalletId;
    }

    public void setEnterpriseWalletId(int enterpriseWalletId) {
        this.enterpriseWalletId = enterpriseWalletId;
    }

    public char getFixedExpensesAmount() {
        return fixedExpensesAmount;
    }

    public void setFixedExpensesAmount(char fixedExpensesAmount) {
        this.fixedExpensesAmount = fixedExpensesAmount;
    }

    public char getIncomesAmount() {
        return incomesAmount;
    }

    public void setIncomesAmount(char incomesAmount) {
        this.incomesAmount = incomesAmount;
    }

    public char getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(char purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
        
}
