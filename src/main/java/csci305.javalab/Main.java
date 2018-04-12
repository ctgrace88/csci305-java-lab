package csci305.javalab;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Player p1 = new Human();        // Stores player 1
        Player p2 = new Human();        // Stores player 2
        int p1Score = 0;                // Stores player 1's score
        int p2Score = 0;                // Stores player 2's score
        Scanner in = new Scanner(System.in);
        int input;                      // Used to store player input

        // Welcome message
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Connor Grace.\n");

        // Starting menu
        System.out.println("Please choose two players:" +
                           "\n\t(1) Human" +
                           "\n\t(2) StupidBot" +
                           "\n\t(3) RandomBot" +
                           "\n\t(4) IterativeBot" +
                           "\n\t(5) LastPlayBot" +
                           "\n\t(6) MyBot\n");

        // Ask to choose player 1 until user input is valid
        System.out.print("Select player 1: ");
        do {
            input = in.nextInt();
            if (input < 1 || input > 6) {
                System.out.println("Invalid: Please enter a number from 1-6");
                System.out.print("Select player 1: ");
            } else {
                if (input == 1)
                    p1 = new Human();
                else if (input == 2)
                    p1 = new StupidBot();
                else if (input == 3)
                    p1 = new RandomBot();
                else if (input == 4)
                    p1 = new IterativeBot();
                else if (input == 5)
                    p1 = new LastPlayBot();
                else
                    p1 = new MyBot();
            }
        } while(input < 1 || input > 6);

        // Ask to choose player 1 until user input is valid
        System.out.print("Select player 2: ");
        do {
            input = in.nextInt();
            if (input < 1 || input > 6) {
                System.out.println("Invalid: Please enter a number from 1-6");
                System.out.print("Select player 2: ");
            } else {
                if (input == 1)
                    p2 = new Human();
                else if (input == 2)
                    p2 = new StupidBot();
                else if (input == 3)
                    p2 = new RandomBot();
                else if (input == 4)
                    p2 = new IterativeBot();
                else if (input == 5)
                    p2 = new LastPlayBot();
                else
                    p2 = new MyBot();
            }
        } while(input < 1 || input > 6);

        System.out.println("\n" + p1.getName() + " vs " + p2.getName() + ". Go!");

        // Loop to play 5 rounds of the game
        for(int i = 1; i <= 5; i++){
            // Print round number
            System.out.println("\nRound " + i + ":");

            // If player 1 is a human, ask them to choose their move
            if (p1.getName().equals("Human"))
                System.out.println("Player 1: Choose your move");

            // Run play method for player 1
            Element p1Move = p1.play();

            // If player 2 is a human, ask them to choose their move
            if (p1.getName().equals("Human"))
                System.out.println("Player 2: Choose your move");

            // Run play method for player 1
            Element p2Move = p2.play();

            // If player 1 or 2 are of type LastPlayBot or MyBot, they will store the opponents last move
            if (p1.getName().equals("LastPlayBot") || p1.getName().equals("MyBot"))
                p1.storeOppLast(p2Move);
            if (p2.getName().equals("LastPlayBot") || p2.getName().equals("MyBot"))
                p2.storeOppLast(p1Move);

            // If player 1 or 2 are of type MyBot, they will store their own last move
            if (p1.getName().equals("MyBot"))
                p1.storeMyLast(p1Move);
            if (p2.getName().equals("MyBot"))
                p2.storeMyLast(p2Move);

            // Print the outcome of the round
            System.out.println("\tPlayer 1 chose " + p1Move.getName());
            System.out.println("\tPlayer 2 chose " + p2Move.getName());
            System.out.println(p1Move.compareTo(p2Move));

            // Update the scores of the players
            if (p1Move.compareTo(p2Move).contains("1")) {
                // Player 1 gets a point
                p1Score++;

                // Update if MyBot won or not
                p1.setWonLast(true);
                p2.setWonLast(false);
            }
            else {
                // Player 2 gets a point
                p2Score++;

                // Update if MyBot won or not
                p1.setWonLast(false);
                p2.setWonLast(true);
            }
        }

        // Print final scores
        System.out.println("\nThe score is " + p1Score + " to " + p2Score + ".");

        // Print game result (who won)
        if (p1Score > p2Score)
            System.out.println("Player 1 (" + p1.getName() + ") wins the game!");
        else if (p1Score < p2Score)
            System.out.println("Player 2 (" + p2.getName() + ") wins the game!");
        else
            System.out.println("Game was a draw.");
    }
}
