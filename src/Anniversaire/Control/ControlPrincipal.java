import Anniversaire.Model.Asterix;
import Anniversaire.Model.iHeros;
import Anniversaire.View.PagePrincipale;

public class ControlPrincipal {
    private PagePrincipale fenetre;
    private Asterix asterix;
    private Obelix obelix;
    private ActionClickButton actionAsterix;
    private ActionClickButton actionObelix;

    public ControlPrincipal(){
        asterix=new Asterix();
        obelix=new Obelix();
        actionAsterix=new ActionClickButton(this,asterix);
        actionObelix=new ActionClickButton(this,obelix);
        fenetre = new PagePrincipale(actionAsterix,actionObelix );        
    }

    public void increment(iHeros hero){
        if (hero.getClass().equals("Anniversaire.View.Asterix")){
            int count=fenetre.getPanelBas().getLabelAsterix().getCount();
            fenetre.getPanelBas().getLabelAsterix().setCount(count+1);
        } else {
            int count=fenetre.getPanelBas().getLabelObelix().getCount();
            fenetre.getPanelBas().getLabelObelix().setCount(count+2);
        }
    }
}
