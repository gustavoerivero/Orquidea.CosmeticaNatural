
package models;

/**
 * Clase de Insumo.
 * @author Gustavo
 */
public class Supply {
    
    private int     id;
    
    private String  name,
                    description;
    
    private double  stockMinimun,
                    stockMaximun,
                    quantity,
                    cost;
    
    private char    state;

    /**
     * Constructor de la clase Insumo.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre del insumo.
     * @param description Descripción del insumo.
     * @param stockMinimun Stock Mínimo de insumo.
     * @param stockMaximun Stock Máximo de insumo.
     * @param quantity Cantidad de insumos.
     * @param cost Costo del insumo.
     * @param state Estado del insumo.
     */
    public Supply(int id, String name, String description, double stockMinimun, 
            double stockMaximun, double quantity, double cost, char state) {
        
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockMinimun = stockMinimun;
        this.stockMaximun = stockMaximun;
        this.quantity = quantity;
        this.cost = cost;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getStockMinimun() {
        return stockMinimun;
    }

    public void setStockMinimun(double stockMinimun) {
        this.stockMinimun = stockMinimun;
    }

    public double getStockMaximun() {
        return stockMaximun;
    }

    public void setStockMaximun(double stockMaximun) {
        this.stockMaximun = stockMaximun;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setState(char state) {
        this.state = state;
    }
 
}
