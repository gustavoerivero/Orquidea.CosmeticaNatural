
package models;

/**
 *
 * @author Gustavo
 */
public class RequerimentElaboration {
    
    private int     supplyId,
                    productId;
    
    private double  quantity;

    /**
     * Constructor de la clase Requisito para Elaboración
     * @param supplyId Atributo identificador del Insumo requerido.
     * @param productId Atributo identificador del Producto a elaborar.
     * @param quantity Cantidad del insumo usado para elaborar el producto.
     */
    public RequerimentElaboration(int supplyId, int productId, double quantity) {
        
        this.supplyId = supplyId;
        this.productId = productId;
        this.quantity = quantity;
        
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
}
