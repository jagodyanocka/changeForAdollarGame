package Chapter4;

import java.util.Random;
import java.util.Scanner;

/*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
Roll the die for the user (generate a Random number between 1 - 6) and advance the user that number
of spaces on the game board. [Code for this is in Independent Exercise section]
After each roll, tell the user which game space they are on and how many more spaces they have to go
to win.
Repeat this 4 additional times for 5 rolls in total.
However, if the user gets to 20 before 5 rolls, end the game - they've won.
If they are greater than or less than 20 spaces exactly, they lose.
Remember there are only 20 spaces on the board, so a message like "You advanced to space
*/
public class rollTheDieGame {

    public static void main(String[] args) {

        //      Generate repeatable scenario-loop

        int spaces = 0;
        int maxSpaces = 20;
        int maxDieRoll = 5;

        for (int i = 0; i < maxDieRoll; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            spaces = spaces + die;

            if (spaces == maxSpaces) {
                System.out.println(" Roll #" + (i+1) + "You have rolled " + die + " You are now on space " + spaces +
                        " You have won the game");
                        break;
            } else if (spaces != maxSpaces && (i + 1) == 5) {
                System.out.println("Roll #" + (i+1)  + ": You have rolled " + die + " And you are not on the " + maxSpaces + " space." + " You have lost the game");
            }
            else {
                System.out.println("Roll #" + (i + 1) + ": You have rolled " + die + " And you are now on space " + spaces +
                        " You have " + (maxSpaces - spaces) + " more to go");
                System.out.println("Do You want to roll again? Type True or False");
                Scanner scanner = new Scanner(System.in);
                boolean play = scanner.nextBoolean();
            }
        }
    }
}
