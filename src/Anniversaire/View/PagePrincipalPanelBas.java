package Anniversaire.View;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class PagePrincipalPanelBas extends JPanel {
    //contient les panels asterix et obelix
    public PagePrincipalPanelBas(){
        this.setLayout(new GridLayout(1,2));

        this.add(new PanelAsterix());
        this.add(new PanelObelix());

        this.setVisible(true);
    }
}
