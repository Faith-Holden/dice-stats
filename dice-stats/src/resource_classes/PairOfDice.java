package resource_classes;

public class PairOfDice {
    private int die1 = 0;
    private int die2 = 0;
    private int diceTally = 0;
    private int rollCounter = 0;
    public PairOfDice() {
        roll();
    }
    public PairOfDice(int val1, int val2) {
        die1 = val1;
        die2 = val2;
    }
    public void roll() {
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        diceTally = die1+die2;
        rollCounter++;
    }

    public int getDie1(){
        return die1;
    }
    public int getDie2() {
        return die2;
    }
    public int getDiceTally(){
        return diceTally;
    }
    public int getRollCounter() {
        return rollCounter;
    }
    public int[] getDice(){
        return new int[] {die1, die2};
    }

    public String toString(){
        return "The dice results of roll (" + rollCounter + ") were " + die1 + " and " + die2+ ".";
    }
}
