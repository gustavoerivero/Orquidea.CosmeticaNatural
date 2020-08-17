
package models;

import java.util.Date;

/**
 * Clase de Compra.
 * @author Gustavo
 */
public class Purchase {
    
    private int     id,
                    employeeId;
    
    private long    accountBank;
    
    private Date    date;
    
    private double  subtotal,
                    iva,
                    total;
    
    private char    state;

    /**
     * Constructor de la clase Compra.
     * @param id Atributo identificador (Autoincrementable).
     * @param employeeId Atributo identificador del empleado asociado a la compra.
     * @param accountBank Cuenta bancaria usada para pagar.
     * @param date Fecha de la compra.
     * @param subtotal Subtotal de la compra.
     * @param iva IVA de la compra.
     * @param total Total de la compra.
     * @param state Estado (Activo o Inactivo).
     */
    public Purchase(int id, int employeeId, long accountBank, Date date, 
            double subtotal, double iva, double total, char state) {
        
        this.id = id;
        this.employeeId = employeeId;
        this.accountBank = accountBank;
        this.date = date;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.state = state;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public long getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(long accountBank) {
        this.accountBank = accountBank;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }
        
}
