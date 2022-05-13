package Anniversaire.View;
import javax.naming.ldap.Control;
import javax.swing.JFrame;
import java.awt.event.*;

import Anniversaire.Control.ControlPrincipal;

import java.awt.GridLayout;
import java.io.IOException;

public class PagePrincipale extends JFrame{
    private PagePrincipalPanelBas bas;
    public PagePrincipale(ActionClickButton actionAsterix,ActionClickButton actionObelix) throws IOException{
        bas= new PagePrincipalPanelBas(actionAsterix,actionObelix);
        //Page principale composée de l'image du haut et du Panel PagePrincipalePanelBas
        this.setLayout(new GridLayout(2,1));
        this.add(new PagePrincipalPanelHaut());
        this.add(bas);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Jpanel getPanelBas(){
        return bas;
    }
}
