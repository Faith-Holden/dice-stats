package solution;

import resource_classes.StatCalc;

public class Main {
    public static void main(String[]args){
        int counter = 0;
        StatCalc statsFor2 = new StatCalc();
        StatCalc statsFor3 = new StatCalc();
        StatCalc statsFor4 = new StatCalc();
        StatCalc statsFor5 = new StatCalc();
        StatCalc statsFor6 = new StatCalc();
        StatCalc statsFor7 = new StatCalc();
        StatCalc statsFor8 = new StatCalc();
        StatCalc statsFor9 = new StatCalc();
        StatCalc statsFor10 = new StatCalc();
        StatCalc statsFor11 = new StatCalc();
        StatCalc statsFor12 = new StatCalc();

        while(counter<10000){
            statsFor2.enter(countRollsToTally(2));
            statsFor3.enter(countRollsToTally(3));
            statsFor4.enter(countRollsToTally(4));
            statsFor5.enter(countRollsToTally(5));
            statsFor6.enter(countRollsToTally(6));
            statsFor7.enter(countRollsToTally(7));
            statsFor8.enter(countRollsToTally(8));
            statsFor9.enter(countRollsToTally(9));
            statsFor10.enter(countRollsToTally(10));
            statsFor11.enter(countRollsToTally(11));
            statsFor12.enter(countRollsToTally(12));
            counter++;
        }

        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 2 was ");
        System.out.println(statsFor2.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor2.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor2.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 3 was ");
        System.out.println(statsFor3.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor3.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor3.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 4 was ");
        System.out.println(statsFor4.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor4.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor4.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 5 was ");
        System.out.println(statsFor5.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor5.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor5.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 6 was ");
        System.out.println(statsFor6.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor6.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor6.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 7 was ");
        System.out.println(statsFor7.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor7.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor7.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 8 was ");
        System.out.println(statsFor8.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor8.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor8.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 9 was ");
        System.out.println(statsFor9.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor9.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor9.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 10 was ");
        System.out.println(statsFor10.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor10.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor10.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 11 was ");
        System.out.println(statsFor11.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor11.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor11.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");
        System.out.print("With 10,000 trials, the average number of times it took to roll a tally of 12 was ");
        System.out.println(statsFor12.getMean());
        System.out.print("The max number of times was ");
        System.out.println(statsFor12.getMax());
        System.out.print("The standard deviation was ");
        System.out.println(statsFor12.getStandardDeviation());
        System.out.println("_______________________________________________________________________________");

    }

    public static int countRollsToTally(int desiredTally){
        if (desiredTally<2|| desiredTally>12){
            throw new IllegalArgumentException(desiredTally+ " is not a possible roll with two dice!");
        }
        int counter = 0;
        int diceTally=0;
        while (diceTally!=desiredTally){
            int die1 = (int) ((6*Math.random())+1);
            int die2 = (int) ((6*Math.random())+1);
            diceTally = die1+die2;
            counter++;
        }
        return counter;
    }


}
