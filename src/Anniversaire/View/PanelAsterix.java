package Anniversaire.View;
import javax.swing.*;
import Anniversaire.Control.ControlPrincipal;
import Anniversaire.Model.Asterix;


public class PanelAsterix extends JPanel{
    public PanelAsterix(){
        this.add(new JLabel(new ImageIcon("src/asterixBaffes.png")));
        this.setVisible(true);
    }
}