
package models;

/**
 * Clase de Producto.
 * @author Gustavo
 */
public class Product {
    
    private int     id;
    
    private String  name,
                    description;
    
    private double  stockMinimun,
                    stockMaximun,
                    quantity,
                    cost,
                    price;
    
    private char    type,
                    state;

    /**
     * Constructor de la clase Producto.
     * @param id Atributo identificador (Autoincrementable).
     * @param name Nombre del producto.
     * @param description Descripción del producto.
     * @param stockMinimun Stock Mínimo del producto.
     * @param stockMaximun Stock Máximo del producto.
     * @param quantity Cantidad del producto.
     * @param cost Costo del producto.
     * @param price Precio del producto.
     * @param type Tipo de producto.
     * @param state Estado del producto.
     */
    public Product(int id, String name, String description, double stockMinimun, 
            double stockMaximun, double quantity, double cost, double price, 
            char type, char state) {
        
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockMinimun = stockMinimun;
        this.stockMaximun = stockMaximun;
        this.quantity = quantity;
        this.cost = cost;
        this.price = price;
        this.type = type;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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