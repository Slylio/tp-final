package Anniversaire.Control;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import Anniversaire.Model.Asterix;
import Anniversaire.Model.iHeros;

public class ActionClickBouton extends AbstractAction{
    private iHeros hero;
    
    public ActionClickBouton(iHeros hero){
        this.hero=hero;
    }

    public iHeros getHero() {
        return hero;
    }

    public void setHero(iHeros hero) {
        this.hero = hero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(hero.getName()+" action");     
    }


}