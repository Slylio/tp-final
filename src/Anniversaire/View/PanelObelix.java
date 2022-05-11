package Anniversaire.View;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelObelix extends JPanel{
    private JPanel imageButton;
    public PanelObelix(){
        this.add(new JLabel("0"));
        ImageIcon imageObelix = new ImageIcon("obelix.png");
        JLabel imageButton = new JLabel(imageObelix);
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
