
package models;

/**
 *
 * @author Gustavo
 */
public class PurchaseDetail {
    
    private int     purchaseId,
                    supplyId;
    
    private double  quantity;

    /**
     * Constructor de la clase de Detalle de Compra.
     * @param purchaseId Atributo identificador de la Compra.
     * @param supplyId Atributo identificador del Insumo.
     * @param quantity Cantidad de insumos comprados.
     */
    public PurchaseDetail(int purchaseId, int supplyId, double quantity) {
        
        this.purchaseId = purchaseId;
        this.supplyId = supplyId;
        this.quantity = quantity;
        
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
}
