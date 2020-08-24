
package models;

/**
 *
 * @author Gustavo
 */
public class UserTypeSettings {
    
    private int     userTypeId;
    
    private char    walletDataView,
                    employeeDataView,
                    clientDataView,
                    reportsView,
                    changeProductData,
                    changeSupplyData,
                    changeProviderData,
                    changeClientData,
                    changeEmployeeData,
                    changeEnterpriseData;

    /**
     * Constructor de la clase de Configuraciones del tipo de usuario.
     * @param userTypeId Atributo identificador del tipo de usuario.
     * @param walletDataView Visualizar datos de la billetera.
     * @param employeeDataView Visualizar datos de empleados.
     * @param clientDataView Visualizar datos de clientes.
     * @param reportsView Visualizar reportes.
     * @param changeProductData Cambiar datos de productos.
     * @param changeSupplyData Cambiar datos de insumos.
     * @param changeProviderData Cambiar datos de proveedores.
     * @param changeClientData Cambiar datos de clientes.
     * @param changeEmployeeData Cambiar datos de empleados.
     * @param changeEnterpriseData Cambiar datos de empresa.
     */
    public UserTypeSettings(int userTypeId, char walletDataView, 
            char employeeDataView, char clientDataView, char reportsView, 
            char changeProductData, char changeSupplyData, char changeProviderData, 
            char changeClientData, char changeEmployeeData, char changeEnterpriseData) {
        
        this.userTypeId = userTypeId;
        this.walletDataView = walletDataView;
        this.employeeDataView = employeeDataView;
        this.clientDataView = clientDataView;
        this.reportsView = reportsView;
        this.changeProductData = changeProductData;
        this.changeSupplyData = changeSupplyData;
        this.changeProviderData = changeProviderData;
        this.changeClientData = changeClientData;
        this.changeEmployeeData = changeEmployeeData;
        this.changeEnterpriseData = changeEnterpriseData;
        
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public char getWalletDataView() {
        return walletDataView;
    }

    public void setWalletDataView(char walletDataView) {
        this.walletDataView = walletDataView;
    }

    public char getEmployeeDataView() {
        return employeeDataView;
    }

    public void setEmployeeDataView(char employeeDataView) {
        this.employeeDataView = employeeDataView;
    }

    public char getClientDataView() {
        return clientDataView;
    }

    public void setClientDataView(char clientDataView) {
        this.clientDataView = clientDataView;
    }

    public char getReportsView() {
        return reportsView;
    }

    public void setReportsView(char reportsView) {
        this.reportsView = reportsView;
    }

    public char getChangeProductData() {
        return changeProductData;
    }

    public void setChangeProductData(char changeProductData) {
        this.changeProductData = changeProductData;
    }

    public char getChangeSupplyData() {
        return changeSupplyData;
    }

    public void setChangeSupplyData(char changeSupplyData) {
        this.changeSupplyData = changeSupplyData;
    }

    public char getChangeProviderData() {
        return changeProviderData;
    }

    public void setChangeProviderData(char changeProviderData) {
        this.changeProviderData = changeProviderData;
    }

    public char getChangeClientData() {
        return changeClientData;
    }

    public void setChangeClientData(char changeClientData) {
        this.changeClientData = changeClientData;
    }

    public char getChangeEmployeeData() {
        return changeEmployeeData;
    }

    public void setChangeEmployeeData(char changeEmployeeData) {
        this.changeEmployeeData = changeEmployeeData;
    }

    public char getChangeEnterpriseData() {
        return changeEnterpriseData;
    }

    public void setChangeEnterpriseData(char changeEnterpriseData) {
        this.changeEnterpriseData = changeEnterpriseData;
    }
        
}
