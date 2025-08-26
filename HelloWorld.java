/**
 * Represents a person who can be greeted and introduced.
 */
public class HelloWorld {
    /**
     * Main method for demonstrating HelloWorld class usage.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        HelloWorld person1 = new HelloWorld("Jake");
        person1.greet();
        person1.greet("Hi");
        person1.introduce();

    HelloWorld person2 = new HelloWorld("Chloe", 21);
        person2.greet();
        person2.greet("Welcome");
        person2.introduce();
    }
    private String name;
    private int age;

    /**
     * Constructs a HelloWorld object with a name only.
     * @param name the person's name
     */
    public HelloWorld(String name) {
        this.name = name;
        this.age = -1; // Default value if age not provided
    }

    /**
     * Constructs a HelloWorld object with a name and age.
     * @param name the person's name
     * @param age the person's age
     */
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Prints a default greeting message.
     */
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Prints a custom greeting message.
     * @param message the custom message
     */
    public void greet(String message) {
        System.out.println(message + ", " + name + "!");
    }

    /**
     * Introduces the person, including age if available.
     */
    public void introduce() {
        if (age >= 0) {
            System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        } else {
            System.out.println("Hello, my name is " + name + ".");
        }
    }
}
