
package models;

import java.util.Date;

/**
 * Clase de Gasto Fijo.
 * @author Gustavo
 */
public class FixedExpense {
    
    private int     id,
                    enterpriseId;
    
    private String  name,
                    description;
    
    private Date    date;
    
    private double  cost;
    
    private char    type,
                    state;

    /**
     * Constructor de la clase Gasto Fijo
     * @param id Atributo identificador (Autoincrementable).
     * @param enterpriseId Atributo identificador de la empresa.
     * @param name Nombre del gasto fijo.
     * @param description Descripción del gasto fijo.
     * @param date Fecha del gasto fijo.
     * @param cost Monto del gasto.
     * @param type Tipo de gasto.
     * @param state Estado del gasto.
     */
    public FixedExpense(int id, int enterpriseId, String name, 
            String description, Date date, double cost, char type, char state) {
        
        this.id = id;
        this.enterpriseId = enterpriseId;
        this.name = name;
        this.description = description;
        this.date = date;
        this.cost = cost;
        this.type = type;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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
