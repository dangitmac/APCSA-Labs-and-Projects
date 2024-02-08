// Mac Dang - November 14, 2022
// Mr. Schneider - AP Computer Science A
// rochambeau - Project 4

// Jan 23 2023 update - game now plays a best of x amount of rounds requested. so if the user
// requests 3 rounds and wins the first 2 the game automatically ends. and there is now a play again
// feature for continuous play. thanks


import java.util.Scanner;

public class rochambeauGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();

        while (true) {
            int playerWins = 0;
            int computerWins = 0;
            int ties = 0;
            int result;
            boolean gameOver = false;

            System.out.print("Enter the number of rounds to play (3, 5, etc.) : ");
            int rounds = input.nextInt();
            int winNumber = (rounds / 2) + 1;

            for (int i = 1; i <= rounds; i++) {
                System.out.print("\nEnter \"0\" to play as rock, \"1\" for paper and \"2\" for scissors: ");
                int playerInput = input.nextInt();
                int computerInput = (int) (Math.random() * 3);

                System.out.println(name + " chooses: " + translateToString(playerInput));
                System.out.println("Computer chooses: " + translateToString(computerInput));
                result = gameResults(playerInput, computerInput);

                if (result == 1) {
                    System.out.println(translateToString(playerInput) + " beats " + translateToString(computerInput) + " - You win");
                    playerWins++;
                } else if (result == 2) {
                    System.out.println(translateToString(computerInput) + " beats " + translateToString(playerInput) + " - You lose");
                    computerWins++;
                } else if (result == 0) {
                    System.out.println(translateToString(computerInput) + " does not beat " + translateToString(playerInput) + " - It is a tie");
                    ties++;
                }

                if (playerWins == winNumber || computerWins == winNumber) {
                    gameOver = true;
                    break;
                }
            }

            if (gameOver) {
                System.out.println("\nGame result: " + name + " - " + playerWins + "\tComputer - " + computerWins + "\tTies - " + ties);

                if (playerWins > computerWins) {
                    System.out.println(name + " beats Computer " + playerWins + " to " + computerWins);
                } else if (playerWins < computerWins) {
                    System.out.println("Computer beats " + name + " " + computerWins + " to " + playerWins);
                } else {
                    System.out.println("It is a draw");
                }
            }
            System.out.print("Would you like to play again? (y/n) ");
            String playAgain = input.next();

            if (playAgain.equalsIgnoreCase("n")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }


    public static String translateToString(int x) {
        if (x == 0)
            return "rock";
        else if (x == 1)
            return "paper";
        else
            return "scissors";
    }

    // method that returns the winner between player and computer
    // it returns 1 if the player wins, 2 if computer wins and 0 if it's a tie
    public static int gameResults(int player, int computer) {

        // 0 = rock
        // 1 = paper
        // 2 = scissors

        if(player == 0 && computer == 1)
            return 2;
        else if(player == 0 && computer == 2)
            return 1;
        else if(player == 1 && computer == 0)
            return 1;
        else if(player == 1 && computer == 2)
            return 2;
        else if(player == 2 && computer == 0)
            return 2;
        else if(player == 2 && computer == 1)
            return 1;
        else
            return 0;
    }
}
