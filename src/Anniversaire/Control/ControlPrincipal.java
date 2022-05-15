package Anniversaire.Control;
import java.io.IOException;
import Anniversaire.Model.*;
import Anniversaire.View.LabelPanel;
import Anniversaire.View.PagePrincipale;
import Anniversaire.View.PanelAsterix;
import Anniversaire.View.PanelObelix;

public class ControlPrincipal {
    private PagePrincipale fenetre;
    private Asterix asterix;
    private Obelix obelix;
    private ActionClickButton actionAsterix;
    private ActionClickButton actionObelix;

    public ControlPrincipal() throws IOException{
        asterix=new Asterix();
        obelix=new Obelix();
        actionAsterix=new ActionClickButton(this,asterix);
        actionObelix=new ActionClickButton(this,obelix);
        fenetre = new PagePrincipale(actionAsterix,actionObelix );        
    }

    public void increment(iHeros hero){
        PanelAsterix panelImageAsterix = fenetre.getHaut().getPanelAsterix();
        PanelObelix panelImageObelix = fenetre.getHaut().getPanelObelix();
        if (hero.getClass().toString().contains("Asterix")){
            //compteur
            LabelPanel labelPanelAsterix = fenetre.getPanelBas().getLabelAsterix();
            int presentCount=labelPanelAsterix.getCount();
            labelPanelAsterix.setCount(presentCount+1);
            labelPanelAsterix.updateDisplayCount();
            //image baffes
            
            
            panelImageAsterix.setVisible(true);
            panelImageObelix.setVisible(false);

        } else {
            LabelPanel labelPanelObelix = fenetre.getPanelBas().getLabelObelix();
            int presentCount=labelPanelObelix.getCount();
            labelPanelObelix.setCount(presentCount+2);
            labelPanelObelix.updateDisplayCount();
            panelImageAsterix.setVisible(false);
            panelImageObelix.setVisible(true);
        }
    }
}
