package Anniversaire.View;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.io.IOException;

public class PagePrincipale extends JFrame{
    public PagePrincipale() throws IOException{
        //Page principale composée de l'image du haut et du Panel PagePrincipalePanelBas
        this.setLayout(new GridLayout(2,1));
        this.add(new PagePrincipalPanelHaut());
        this.add(new PagePrincipalPanelBas());
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws IOException {
        new PagePrincipale();
    }
}
