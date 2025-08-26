public class HelloWorld {
    private String name;
    private int age;

    public HelloWorld(String name) {
        this.name = name;
        this.age = -1; // Default value if age not provided
    }

    // Second constructor
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method with a custom message
    public void greet(String message) {
        System.out.println(message + ", " + name + "!");
    }

    public void introduce() {
        if (age >= 0) {
            System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
        } else {
            System.out.println("Hello, my name is " + name + ".");
        }
    }

    public static void main(String[] args) {
        // Demonstrate first constructor
        HelloWorld student = new HelloWorld("Jake");
        student.greet();
        student.greet("Hi there");
        student.introduce();

        // Demonstrate second constructor
        HelloWorld person = new HelloWorld("Chloe", 21);
        person.greet();
        person.greet("Welcome");
        person.introduce();
    }
}
