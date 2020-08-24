
package models;

/**
 *
 * @author Gustavo
 */
public class ProvidedBy {
    
    private int     supplyId,
                    providerId;

    /**
     * Constructor de la clase Provisionado
     * @param supplyId Atributo identificador del insumo provisto.
     * @param providerId Atributo identificador del proveedor.
     */
    public ProvidedBy(int supplyId, int providerId) {
        
        this.supplyId = supplyId;
        this.providerId = providerId;
        
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }
       
}
