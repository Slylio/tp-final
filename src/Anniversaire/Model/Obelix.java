package Anniversaire.Model;

public class Obelix implements iHeros {
    private int counter;
    public Obelix(){
        counter=0;
    }
    public int getCounter() {
        return counter;
    }

    public void addCounter(){
        counter+=2;
    }

    public void setCounter(int counter) {
        this.counter=counter;
    }
}