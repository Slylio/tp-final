package Anniversaire.Control;
import java.awt.event.ActionEvent;
import Anniversaire.Model.iHeros;
import java.awt.event.ActionListener;
;

public class ActionClickButton implements ActionListener{
    private ControlPrincipal controler;
    private iHeros hero;

    public ActionClickButton(ControlPrincipal controler,iHeros hero){
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
    public void actionPerformed(ActionEvent e) {
        controler.increment(hero);
    }
}