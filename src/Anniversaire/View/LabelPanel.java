package Anniversaire.View;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelPanel extends JPanel{
    private JLabel label;
    private int count;
    public LabelPanel(int count){
        label = new JLabel(String.valueOf(count));
        this.add(label);
        this.setVisible(true);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count){
        this.count=count;
    }

    public void updateDisplayCount(){
        label.setText(String.valueOf(count));
    }

}