package Anniversaire.View;
import javax.swing.JFrame;
import Anniversaire.Control.ActionClickButton;
import java.awt.GridLayout;
import java.io.IOException;

public class PagePrincipale extends JFrame{
    private PagePrincipalPanelBas bas;
    private PagePrincipalPanelHaut haut;
    public PagePrincipale(ActionClickButton actionAsterix,ActionClickButton actionObelix) throws IOException{
        bas= new PagePrincipalPanelBas(actionAsterix,actionObelix);
        haut = new PagePrincipalPanelHaut();
        //Page principale composée de l'image du haut et du Panel PagePrincipalePanelBas
        this.setLayout(new GridLayout(2,1));
        this.add(haut);
        this.add(bas);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public PagePrincipalPanelBas getPanelBas(){
        return bas;
    }

    public PagePrincipalPanelHaut getHaut() {
        return haut;
    }
}
