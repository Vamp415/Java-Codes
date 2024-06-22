import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int userChoice;
        int computerChoice;
        String[] choices = {"Rock", "Paper", "Scissors"};
        while (true) {
            System.out.print("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
            userChoice = input.nextInt();
            computerChoice = rand.nextInt(3) + 1;
            System.out.println("Computer chose " + choices[computerChoice - 1]);
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}