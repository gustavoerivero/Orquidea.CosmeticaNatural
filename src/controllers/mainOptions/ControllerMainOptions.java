
package controllers.mainOptions;

import views.mainOptions.*;

import lib.SupportFunctions;

import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class ControllerMainOptions implements java.awt.event.ActionListener{ 
    
    private MainOptions         main;
    
    private SupportFunctions    support;
    
    public ControllerMainOptions(JPanel parent){
        
        main    = new MainOptions();
        support = new SupportFunctions();
        
        main.addActionEvents(this);
        
        support.cardSelection(parent, main);
        
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    
        if(evt.getSource() == main.btnWalletManagement) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnStats) {
            
            
            
        }
    
    }
    
}
