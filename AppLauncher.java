import java.util.Scanner;

/**
 * AppLauncher class to run the HelloWorld demo.
 */
public class AppLauncher {
    /**
     * Main method to launch the application.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            HelloWorld user = new HelloWorld(name, age);
            user.greet();
            user.greet("Welcome");
            user.introduce();

            // Instantiate more HelloWorld objects
            HelloWorld alice = new HelloWorld("Alice");
            alice.greet();
            alice.greet("Hi");
            alice.introduce();

            HelloWorld bob = new HelloWorld("Bob", 30);
            bob.greet();
            bob.greet("Good day");
            bob.introduce();
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
