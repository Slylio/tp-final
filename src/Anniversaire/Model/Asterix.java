package Anniversaire.Model;

public class Asterix implements iHeros{
    private int counter;
    public Asterix(){
        counter=0;
    }
    public int getCounter() {
        return counter;
    }

    public void addCounter(){
        counter++;
    }
    
    public void setCounter(int counter) {
        this.counter=counter;
    }
    public String getName(){
        return "Astérix";
    }
}

