package Anniversaire.View;
import javax.swing.JPanel;

public class PagePrincipalPanelHaut extends JPanel {
    PanelAsterix panelAsterix;
    PanelObelix panelObelix;
    //card layout a metter avec first and last
    public PagePrincipalPanelHaut(){
        panelAsterix=new PanelAsterix();
        panelObelix=new PanelObelix();
        this.add(panelAsterix);
        this.add(panelObelix);
    }
    
    public PanelAsterix getPanelAsterix() {
        return panelAsterix;
    }

    public PanelObelix getPanelObelix() {
        return panelObelix;
    }

}