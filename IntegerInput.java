import java.util.Scanner;

public class IntegerInput {
    // main function
    public static void main(String[] args) {
        // Declare the variables
        int num;

        // Input the integer
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the input
        num = s.nextInt();

        // Display the integer
        System.out.println("Entered integer is: " + num);

        // Close the Scanner
        s.close();
    }
}
