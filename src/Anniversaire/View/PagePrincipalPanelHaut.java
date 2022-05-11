package Anniversaire.View;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PagePrincipalPanelHaut extends JPanel {
    private String filepath;
    public PagePrincipalPanelHaut(){
        this.add(new JLabel(new ImageIcon(filepath)));
        this.setVisible(true);
    }

    public void setImage(String str){
        switch (str){
            case "obelix":
                this.filepath="obelix.png";
            case "asterix":
                this.filepath="asterix.png";
            default:
                this.filepath="";
        }
    }
}
