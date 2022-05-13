package Anniversaire.Control;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

public class ActionClickBouton extends AbstractAction{
    private String hero;
    public ActionClickBouton(String hero){
        this.hero=hero;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(getHero()+" action");     
    }


}