
package controllers.mainOptions;

import views.MainMenu;
import views.mainOptions.*;

import lib.SupportFunctions;

import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class ControllerMainOptions implements java.awt.event.ActionListener{ 
    
    private MainOptions         main;
    
    private MainMenu            menu;
    
    private SupportFunctions    support;
    
    public ControllerMainOptions(MainMenu menu, JPanel parent){
        
        this.menu   = menu;
        
        main        = new MainOptions();
        support     = new SupportFunctions();
        
        main.addActionEvents(this);
        
        support.cardSelection(parent, main);
                
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    
        if(evt.getSource() == main.btnWalletManagement) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnStats) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnSell) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnBuy) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnBuild) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnFixedExpenses) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnClient) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnProvider) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnEmployee) {
            
            
            
        }
        
        else if(evt.getSource() == main.btnEnterprise) {
            
            
            
        }
    
    }
    
}
