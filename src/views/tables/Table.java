
package views.tables;

// Se importan las librerías a utilizar.
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

/**
 * 
 * @author Gustavo
 */
public class Table {
    
    //<editor-fold defaultstate="collapsed" desc=" Botónes para tablas ">
        
    /**
     * Método para dar formato a un JButton con características de "Aceptar".
     * @param btnOk JButton que se le desea dar un formato.
     */
    public void addOkButton(JButton btnOk){
                
        btnOk.setName("o");
        ImageIcon okIcon = new ImageIcon(getClass().getResource(
                "/views/images/okIcon-small.png"));        
        btnOk.setIcon(okIcon);
        btnOk.setBackground(new java.awt.Color(245, 245, 245));
        btnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOk.setToolTipText("Aceptar");
        btnOk.setContentAreaFilled(false);
                
    }
    
    /**
     * Método para dar formato a un JButton con características de "Incorporar".
     * @param btnIncorporate JButton que se le desea dar un formato.
     */
    public void addIncorporateButton(JButton btnIncorporate){
                
        btnIncorporate.setName("i");
        ImageIcon incorporateIcon = new ImageIcon(getClass().getResource(
                "/views/images/incorporateIcon-small.png"));        
        btnIncorporate.setIcon(incorporateIcon);
        btnIncorporate.setBackground(new java.awt.Color(245, 245, 245));
        btnIncorporate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncorporate.setToolTipText("Incorporar");
        btnIncorporate.setContentAreaFilled(false);
                
    }
    
    /**
     * Método para dar formato a un JButton con características de "Modificar".
     * @param btnModify JButton que se le desea dar un formato.
     */
    public void addModifyButton(JButton btnModify){
                
        btnModify.setName("m");
        ImageIcon modifyIcon = new ImageIcon(getClass().getResource(
                "/views/images/modifyIcon-small.png"));        
        btnModify.setIcon(modifyIcon);
        btnModify.setBackground(new java.awt.Color(245, 245, 245));
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.setToolTipText("Modificar");
        btnModify.setContentAreaFilled(false);
                
    }
    
    /**
     * Método para dar formato a un JButton con características de "Eliminar"
     * @param btnDelete JButton que se le desea dar un formato.
     */
    public void addDeleteButton(JButton btnDelete){
        
        btnDelete.setName("e");
        ImageIcon deleteIcon = new ImageIcon(getClass().getResource(
                "/views/images/deleteIcon-small.png"));
        btnDelete.setIcon(deleteIcon);
        btnDelete.setToolTipText("Eliminar");
        btnDelete.setBackground(new java.awt.Color(245, 245, 245));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setContentAreaFilled(false);
                
    }
    
    /**
     * Método para dar formato a un JButton con características de "Buscar"
     * @param btnDelete JButton que se le desea dar un formato.
     */
    public void addSearchButton(JButton btnSearch){
        
        btnSearch.setName("s");
        ImageIcon deleteIcon = new ImageIcon(getClass().getResource(
                "/views/images/okIcon-small.png"));
        btnSearch.setIcon(deleteIcon);
        btnSearch.setToolTipText("Buscar");
        btnSearch.setBackground(new java.awt.Color(245, 245, 245));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setContentAreaFilled(false);
                
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructores de tablas ">
        
    /**
     * Método para construir una JTable con formato para venta de dulces.
     * @param table JTable que se le dará formato.
     * @param matrix Datos que se van a incorporar a la JTable.
     */
    public void buildCandyTable(javax.swing.JTable table, Object[][] matrix){
        
        table.setDefaultRenderer(Object.class, new Render());
               
        DefaultTableModel candyTableModel = new  DefaultTableModel(
            matrix,
            new Object[]{
                            "Golosina", "Cantidad", "Precio (Unidad)", 
                            "IVA (Unidad)", "Monto (Unidad)", "Total", 
                            "Modificar", "Eliminar"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        table.setModel(candyTableModel);
        
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
             
        table.setRowHeight(24);
        
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(40);
            table.getColumnModel().getColumn(6).setResizable(false);
            table.getColumnModel().getColumn(6).setPreferredWidth(40);
            table.getColumnModel().getColumn(7).setResizable(false);
            table.getColumnModel().getColumn(7).setPreferredWidth(40);
        }
        
    }
    
    //</editor-fold>
    
    
    public static void setCellsAlignment(JTable table, int alignment){
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
            
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
            table.getColumnModel().getColumn(columnIndex).setResizable(false);
            table.getColumnModel().getColumn(columnIndex).setPreferredWidth(32);
            
        }
        
    }

}
