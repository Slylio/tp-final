package Anniversaire.View;
import javax.swing.*;

import Anniversaire.Control.ActionClickBouton;
import Anniversaire.Model.Obelix;

import java.awt.event.*;


public class PanelObelix extends JPanel{
    public PanelObelix(){
        JButton imageButton = new JButton(new ImageIcon("src/obelix.png"));
        
        this.add(imageButton);
        this.add(new JLabel("0"));
        this.setVisible(true);

        imageButton.addActionListener(new ActionClickBouton(new Obelix()));
    }
}
