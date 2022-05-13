package Anniversaire.View;
import javax.swing.*;
import Anniversaire.Control.ActionClickBouton;
import Anniversaire.Model.Asterix;

import java.awt.event.*;

public class PanelAsterix extends JPanel{
    public PanelAsterix(){
        JButton imageButton = new JButton(new ImageIcon("src/asterix.jpeg"));
        this.add(new JLabel("0"));
        this.add(imageButton);
        this.setVisible(true);

        imageButton.addActionListener(new ActionClickBouton(new Asterix()));
    }
}