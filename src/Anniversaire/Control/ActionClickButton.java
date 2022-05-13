package Anniversaire.Control;
import java.awt.event.ActionEvent;

import javax.naming.ldap.Control;
import javax.swing.AbstractAction;
import javax.swing.JPanel;

import org.w3c.dom.events.MouseEvent;

import Anniversaire.Model.Asterix;
import Anniversaire.Model.iHeros;
import Anniversaire.View.PagePrincipalPanelHaut;
import Anniversaire.View.iPanelHeros;

public class ClickButtonAction implements ActionListener{
    private ControlPrincipal controler;
    private iHeros hero;
    private PagePrincipalPanelHaut panelHaut;

    public ClickButtonAction(ControlPrincipal controler,iHeros hero){
        this.controler=controler;
        this.hero=hero;
    }

    public iHeros getHero() {
        return hero;
    }

    public void setHero(iHeros hero) {
        this.hero = hero;
    }

    @Override
    public void actionPerformed(MouseEvent e) {
        controler.increment(hero);
    }
}