public class LabelPanel extends JPanel{

    private int count;
    public LabelPanel(int count){
        this.add(JLabel(count));
        this.setVisible(true);
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count){
        this.count=count;
    }
}