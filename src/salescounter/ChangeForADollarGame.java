package salescounter;

import java.util.Scanner;

public class ChangeForADollarGame {
    
    public static void main(String[] args) {


        double pennies = 0.01;
        double nickles = 0.05;
        double dimes = 0.10;
        double quarters = 0.25;


        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        double numberPennies = scanner.nextInt() * 1.0;

        System.out.println("How many nickles?");
        double numberNickles = scanner.nextInt() * 1.0;

        System.out.println("How many dimes?");
        double numberDimes = scanner.nextInt() * 1.0;

        System.out.println("How many quarters?");
        double numberQuarters = scanner.nextInt() * 1.0;

        double sum = (pennies * numberPennies) + (nickles * numberNickles) + (dimes * numberDimes) + (quarters * numberQuarters);
        System.out.println(sum);
        double dollar = 1.0;
        System.out.println(dollar - sum);


        if (sum > dollar) {
            double tooMuch = sum - dollar;
            System.out.println("You picked up $ " + tooMuch + " too much");
        }
        else if (sum < dollar) {
            double tooShort = dollar - sum;
            System.out.println("You picked up $ " + tooShort + " too little");
        }
        else {
            System.out.println("Congratulations! You picked up exactly $1. You won the game!");
        }
    }
}
