// Mac Dang - December 7, 2022
// Mr. Schneider - AP Computer Science A
// diceProject - Project 5

import java.util.*;
public class diceProject {
    static final int DICENUM = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        diceProject game = new diceProject();
        int numberOftries = 1;

        boolean stop = false;
        while (!stop) {

            ArrayList<ArrayList<String>> dices = game.defineDice();

            ArrayList<ArrayList<String>> dice_results = new ArrayList<>();

            int[] result = new int[DICENUM];

            for (int index = 0; index < DICENUM; index++) {

                int dice_value = game.rollDice();

                dice_results.add(dices.get(dice_value));

                result[index] = dice_value;
            }

            game.printDice(dice_results);

            game.drawLine();

            if (game.matchDice(result)) {
                System.out.println("Congratulations You win! You got a match on all dice at only " + numberOftries + " tries.");
                numberOftries = 0;

                System.out.print("Do you want to try again? enter 'Y' for Yes or any key to continue stop: ");
                String input = scanner.next();
                if (!input.equalsIgnoreCase("Y")) {
                    System.out.println("Thank you for playing.");
                    stop = true;
                }

            } else {
                System.out.print("Do you want to try again? enter 'Y' for Yes or any key to continue stop: ");
                String input = scanner.next();
                if (!input.equalsIgnoreCase("Y")) {
                    System.out.println("Thank you for playing.");
                    stop = true;
                }
                numberOftries++;
            }
        }
    }

    public ArrayList<ArrayList<String>> defineDice() {
        String topBot  = " ------- ";
        String space   = "|       |";
        String oneDotL = "| *     |";
        String oneDotM = "|   *   |";
        String oneDotR = "|     * |";
        String twoDot  = "| *   * |";

        ArrayList<String> dice_one = new ArrayList<>();
        dice_one.add(topBot);
        dice_one.add(space);
        dice_one.add(oneDotM);
        dice_one.add(space);
        dice_one.add(topBot);

        ArrayList<String> dice_two = new ArrayList<>();
        dice_two.add(topBot);
        dice_two.add(space);
        dice_two.add(twoDot);
        dice_two.add(space);
        dice_two.add(topBot);

        ArrayList<String> dice_three = new ArrayList<>();
        dice_three.add(topBot);
        dice_three.add(oneDotL);
        dice_three.add(oneDotM);
        dice_three.add(oneDotR);
        dice_three.add(topBot);

        ArrayList<String> dice_four = new ArrayList<>();
        dice_four.add(topBot);
        dice_four.add(twoDot);
        dice_four.add(space);
        dice_four.add(twoDot);
        dice_four.add(topBot);

        ArrayList<String> dice_five = new ArrayList<>();
        dice_five.add(topBot);
        dice_five.add(twoDot);
        dice_five.add(oneDotM);
        dice_five.add(twoDot);
        dice_five.add(topBot);

        ArrayList<String> dice_six = new ArrayList<>();
        dice_six.add(topBot);
        dice_six.add(twoDot);
        dice_six.add(twoDot);
        dice_six.add(twoDot);
        dice_six.add(topBot);

        ArrayList<ArrayList<String>> dices = new ArrayList<>();
        dices.add(dice_one);
        dices.add(dice_two);
        dices.add(dice_three);
        dices.add(dice_four);
        dices.add(dice_five);
        dices.add(dice_six);

        return dices;
    }
    public int rollDice() {
        Random random = new Random();
        return random.nextInt(6 - 1) + 1;
    }
    public void printDice(ArrayList<ArrayList<String>> dice_results) {

        // This is going to look weird because I'm using statements we have not learned about yet. I did lots of googling and research while coding this project and
        // I ran into some videos demonstrating switch statements and I decided to utilize it for my DICENUM variable instead of if/else statements. I also didn't
        // really know how I would print the dices side by side,so I googled "how to print side by side in java" and found articles on stack overflow that covered
        // the printf statement and I used that. I heard some other students used for loops to print the dice, but I just found the printf method to be easier for me.

        for (int print = 0; print < 5; print++) {
            switch (DICENUM) {
                case 2:
                    System.out.printf("%10s %10s",
                            dice_results.get(0).get(print),
                            dice_results.get(1).get(print));
                    break;
                case 3:
                    System.out.printf("%10s %10s %10s",
                            dice_results.get(0).get(print),
                            dice_results.get(1).get(print),
                            dice_results.get(2).get(print));
                    break;
                case 4:
                    System.out.printf("%10s %10s %10s %10s",
                            dice_results.get(0).get(print),
                            dice_results.get(1).get(print),
                            dice_results.get(2).get(print),
                            dice_results.get(3).get(print));
                    break;
                case 5:
                    System.out.printf("%10s %10s %10s %10s %10s",
                            dice_results.get(0).get(print),
                            dice_results.get(1).get(print),
                            dice_results.get(2).get(print),
                            dice_results.get(3).get(print),
                            dice_results.get(4).get(print));
                    break;
                case 6:
                    System.out.printf("%10s %10s %10s %10s %10s %10s",
                            dice_results.get(0).get(print),
                            dice_results.get(1).get(print),
                            dice_results.get(2).get(print),
                            dice_results.get(3).get(print),
                            dice_results.get(4).get(print),
                            dice_results.get(5).get(print));
                    break;
                default:
            }
            System.out.println();
        }
    }
    public boolean matchDice(int[] results) {
        for (int index = 0; index < results.length - 1; index++) {
            if(results[index] != results [index + 1]) {
                return false;
            }
        }
        return true;
    }
    public void drawLine() {
        System.out.println("-------------------------------------------------------------------------");
    }
}
