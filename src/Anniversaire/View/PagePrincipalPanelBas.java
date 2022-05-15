package Anniversaire.View;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;

import Anniversaire.Control.ActionClickButton;

public class PagePrincipalPanelBas extends JPanel {
    //contient les panels asterix et obelix
    private LabelPanel labelPanelAsterix;
    private LabelPanel labelPanelObelix;

    public PagePrincipalPanelBas(ActionListener actionAsterix,ActionListener actionObelix){
        labelPanelAsterix=new LabelPanel(0);
        labelPanelObelix=new LabelPanel(0);

        this.setLayout(new GridLayout(1,2));
        
        JButton asterixButton = new JButton(new ImageIcon("src/asterix.jpeg"));
        this.add(labelPanelAsterix);
        this.add(asterixButton);
        
        JButton obelixButton = new JButton(new ImageIcon("src/obelix.png"));
        
        this.add(obelixButton);
        this.add(labelPanelObelix);

        asterixButton.addActionListener(actionAsterix);
        obelixButton.addActionListener(actionObelix);
        
        this.setVisible(true);
    }

    public LabelPanel getLabelAsterix(){
        return labelPanelAsterix;
    }

    public LabelPanel getLabelObelix(){
        return labelPanelObelix;
    }
}
