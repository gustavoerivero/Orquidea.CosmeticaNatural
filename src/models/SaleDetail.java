
package models;

/**
 *
 * @author Gustavo
 */
public class SaleDetail {
    
    private int     saleId,
                    productId;
    
    private double  quantity;

    /**
     * Constructor de la clase Detalle de Venta.
     * @param saleId Atributo identificador de la venta generada.
     * @param productId Atributo identificador del producto vendido.
     * @param quantity Cantidad del producto vendido.
     */
    public SaleDetail(int saleId, int productId, double quantity) {
        
        this.saleId = saleId;
        this.productId = productId;
        this.quantity = quantity;
        
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
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
