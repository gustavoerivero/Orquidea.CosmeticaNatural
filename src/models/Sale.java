
package models;

import java.util.Date;

/**
 * Clase de Venta.
 * @author Gustavo
 */
public class Sale {
    
    private int     id,
                    employeeId,
                    clientId;
    
    private long    accountBank;
    
    private Date    payDate,
                    deliveryDate;
    
    private double  discount,
                    subtotal,
                    iva,
                    total;
    
    private char    payForm,
                    state;

    /**
     * Constructor de la clase Venta.
     * @param id Atributo identificador (Autoincrementable).
     * @param employeeId Atributo identificador del empleado asociado a la venta.
     * @param clientId Atributo identificador del cliente asociado a la venta.
     * @param accountBank Cuenta bancaria donde se recibe el pago de la venta.
     * @param payDate Fecha de la venta.
     * @param deliveryDate Fecha de entrega.
     * @param discount Descuento de la venta.
     * @param iva IVA de la venta.
     * @param total Total de la venta.
     * @param payForm Forma de pago.
     * @param state Estado (Activo o Inactivo).
     */
    public Sale(int id, int employeeId, int clientId, long accountBank, 
            Date payDate, Date deliveryDate, double discount, double subtotal, 
            double iva, double total, char payForm, char state) {
        
        this.id = id;
        this.employeeId = employeeId;
        this.clientId = clientId;
        this.accountBank = accountBank;
        this.payDate = payDate;
        this.deliveryDate = deliveryDate;
        this.discount = discount;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.payForm = payForm;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public long getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(long accountBank) {
        this.accountBank = accountBank;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
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

    public char getPayForm() {
        return payForm;
    }

    public void setPayForm(char payForm) {
        this.payForm = payForm;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

}
