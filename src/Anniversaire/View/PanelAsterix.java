package Anniversaire.View;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelAsterix extends JPanel{
    private JPanel imageButton;
    public PanelAsterix(){
        this.add(new JLabel("0"));

        ImageIcon imageAsterix = new ImageIcon("asterix.png");
        JLabel imageButton = new JLabel(imageAsterix);
        this.add(imageButton);
        this.setVisible(true);
        /*
        imageButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
            System.out.println("CLICKED");
            }
        });*/
    }
}
