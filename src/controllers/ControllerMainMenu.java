
package controllers;

// Se importan las views a utilizar.
import views.*;
import views.tables.Table;

// Se importan las clases de soporte a utilizar.
import lib.SupportFunctions;

// Se importan las librerías a utilizar.
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Clase controlador del MainMenu.
 * @author Gustavo
 */
public class ControllerMainMenu implements ActionListener, MouseListener{
    
    // Se declaran las variables a utilizar.
    private MainMenu            mainMenu;
    private SupportFunctions    support;
    private String              type,
                                nameEmployee;
    
    /**
     * Constructor del controlador del MainMenu.
     * @param type
     * @param nameEmployee 
     */
    public ControllerMainMenu(String type, String nameEmployee){
        
        // Se instancian las variables a utilzar.
        support             = new SupportFunctions();
        mainMenu            = new MainMenu();
        
        this.type           = type;
        this.nameEmployee   = nameEmployee;
        
        mainMenu.addActionEvents(this);
        mainMenu.addMouseEvents(this);
        
    }

    //<editor-fold defaultstate="collapsed" desc=" Actions ">
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        
        
        
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
        
    
    
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MouseEvents (no desarrollar) ">
    
    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //</editor-fold>
    
}
