public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! Welcome to Java Programming.");
        
        // Display command-line arguments if provided
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println("  - " + arg);
            }
        }
        
        // Simple calculation example
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of 10 and 20 is: " + sum);
    }
}