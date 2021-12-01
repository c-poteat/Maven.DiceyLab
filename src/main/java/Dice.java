import java.util.Random;

public class Dice {

    private int dice1;
    private int dice2;

    public Dice(int dice1, int dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public void diceRolls() {
        int numberOfRolls = 10;
        Random randomDice = new Random();
        for (int i = 0; i < numberOfRolls; i++) {
            dice1 = randomDice.nextInt(6) + 1;
            dice2 = randomDice.nextInt(6) + 1;
            System.out.println("You rolled  " + (toStars(dice1 + dice2)));

        }
    }
        public String toStars(int number) {
            StringBuilder temporary = new StringBuilder();
            for (int i = 0; i < number; i++) {
                temporary.append("*");
            }
            return temporary.toString();
        }
    }




    /*
    Create a Simulation class whose Constructor takes arguments:
    numberOfDies to throw
    numberOfTosses to run
     */
//    Kris-Tof Dice Toss
//    Create a Dice class that acts like a set of N random-tossed dies.
//
//    Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee
//
//    Integer toss = dice.tossAndSum();
//    make a couple unit tests for the Dice class.

