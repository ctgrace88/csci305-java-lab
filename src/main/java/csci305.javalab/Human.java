package csci305.javalab;

import java.util.Scanner;

public class Human extends Player {

    int input;      // Store integer input from the human player
    Scanner in = new Scanner(System.in);        // Scanner to read in data

    public Human(){super("Human");}

    // Play method for humans. Returns an element
    public Element play(){
        // Print option menu
        System.out.println("(1) : Rock\n"
                         + "(2) : Paper\n"
                         + "(3) : Scissors\n"
                         + "(4) : Lizard\n"
                         + "(5) : Spock\n");
        System.out.print("Enter your move: ");

        // Accept user input until they enter a valid integer
        do {
            input = in.nextInt();
            if (input < 1 || input > 6){
                System.out.println("Invalid move. Please try again.");
            }
        } while (input < 1 || input > 6);

        // Return the element the human player chose
        if (input == 1)
            return new Rock();
        else if (input == 2)
            return new Paper();
        else if (input == 3)
            return new Scissors();
        else if (input == 4)
            return new Lizard();
        else
            return new Spock();
    }
}
