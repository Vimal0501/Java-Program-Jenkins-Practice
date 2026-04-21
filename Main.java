public class Main {
    
    // Instance variable
    private String appName = "My Java App";
    
    // Method to greet user
    public void greet(String name) {
        System.out.println("Hello, " + name + "! Welcome to " + appName + ".");
    }
    
    // Method to calculate factorial (recursive example)
    public long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Java Demo Program ===");
        
        // Create object and use instance method
        Main app = new Main();
        app.greet("Developer");
        
        // Command-line arguments
        if (args.length > 0) {
            System.out.println("Arguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  Arg[" + i + "]: " + args[i]);
            }
        } else {
            System.out.println("No arguments provided. Try: java Main test1 test2");
        }
        
        // Arithmetic operations
        int x = 15, y = 5;
        System.out.println("Arithmetic: " + x + " + " + y + " = " + (x + y));
        System.out.println("Arithmetic: " + x + " * " + y + " = " + (x * y));
        
        // Factorial example
        System.out.println("Factorial of 5: " + app.factorial(5));
        
        // Array example
        String[] skills = {"Java", "SQL", "Jenkins", "Git", "Postman"};
        System.out.println("Skills list:");
        for (String skill : skills) {
            System.out.println("  - " + skill);
        }
        
        System.out.println("Program completed.");
    }
}