import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a task (or 'quit' to exit): ");
            String task = input.nextLine();
            if (task.equalsIgnoreCase("quit")) {
                break;
            }
            tasks.add(task);
            System.out.println("Task added!");
        }
        System.out.println("Your tasks:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}