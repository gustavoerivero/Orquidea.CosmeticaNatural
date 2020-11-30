
package controllers.mainOptions.enterprise;

import views.MainMenu;
import views.mainOptions.enterprise.EnterpriseMenu;

import lib.SupportFunctions;

import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class ControllerEnterpriseMenu implements java.awt.event.ActionListener{ 
    
    private EnterpriseMenu      enterpriseMenu;
    
    private MainMenu            menu;
    
    private SupportFunctions    support;
    
    public ControllerEnterpriseMenu(MainMenu menu, JPanel parent){
        
        this.menu       = menu;
        
        enterpriseMenu  = new EnterpriseMenu();
        support         = new SupportFunctions();
        
        enterpriseMenu.addActionEvents(this);
        
        support.cardSelection(parent, enterpriseMenu);
                
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
    
        if(evt.getSource() == enterpriseMenu.btnWallet) {
            
            
            
        }
        
        else if(evt.getSource() == enterpriseMenu.btnEmployee) {
            
            
            
        }
        
        else if(evt.getSource() == enterpriseMenu.btnStats) {
            
            
            
        }
        
        else if(evt.getSource() == enterpriseMenu.btnFixedExpenses) {
            
            
            
        }
        
        else if(evt.getSource() == enterpriseMenu.btnEnterprise) {
            
            
            
        }
    
    }
    
}
