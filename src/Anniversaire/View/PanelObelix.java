package Anniversaire.View;
import javax.swing.*;

import Anniversaire.Control.ControlPrincipal;
import Anniversaire.Model.Obelix;


public class PanelObelix extends JPanel {
    public PanelObelix(){
        this.add(new JLabel(new ImageIcon("src/obelixBaffes.png")));
        this.setVisible(true);
    }
}
