import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner (System.in);
        int guess;
        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            numberOfTries++;
            if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("You win! The number was " + numberToGuess);
                System.out.println("It took you " + numberOfTries + " tries.");
                break;
            }
        }
    }
}