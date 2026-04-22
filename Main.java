import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    
    // ANSI Color Constants for Rainbow Console Magic ✨
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_RED = "\u001B[91m";
    public static final String ANSI_GREEN = "\u001B[92m";
    public static final String ANSI_YELLOW = "\u001B[93m";
    public static final String ANSI_BLUE = "\u001B[94m";
    public static final String ANSI_PURPLE = "\u001B[95m";
    public static final String ANSI_CYAN = "\u001B[96m";
    public static final String ANSI_WHITE = "\u001B[97m";
    public static final String[] RAINBOW = {ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN};
    
    // Instance variables
    private String appName = "🚀 Jenkins Java Web-App Practice";
    private Random rand = new Random();
    
    // 🎉 Colorful greeting with sparkle
    public void greet(String name) {
        String color = RAINBOW[rand.nextInt(RAINBOW.length)];
        System.out.println(color + ANSI_BOLD + "✨ Hello, " + name + "! Welcome to " + appName + " ✨" + ANSI_RESET);
    }
    
    // 🔢 Enhanced factorial with ASCII art
    public long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    // 🌈 Rainbow print util
    public static void rainbowPrint(String text) {
        for (int i = 0; i < text.length(); i++) {
            String color = RAINBOW[i % RAINBOW.length];
            System.out.print(color + text.charAt(i));
        }
        System.out.println(ANSI_RESET);
    }
    
    // 🎪 Interactive spinner (fun delay effect)
    public static void spinner(int duration) {
        String spin = "|/-\\";
        for (int i = 0; i < duration; i++) {
            System.out.print("\r" + ANSI_YELLOW + "Loading Jenkins magic " + spin.charAt(i % spin.length()) + " " + ANSI_RESET);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
        System.out.println("\r" + ANSI_GREEN + "✅ Loaded!                   " + ANSI_RESET);
    }
    
    // 📊 Progress bar for uniqueness
    public static void progressBar(int percent) {
        String bar = ANSI_GREEN + "█".repeat(percent / 5) + ANSI_YELLOW + "░".repeat((100 - percent) / 5) + ANSI_RESET;
        System.out.println(ANSI_CYAN + "Build Progress: [" + bar + "] " + percent + "%" + ANSI_RESET);
    }
    
    public static void main(String[] args) {
        // 🎨 Explosive banner
        rainbowPrint(" 🎉 === JENKINS JAVA DEMO SUPERSTAR === 🎉 ");
        System.out.println(ANSI_PURPLE + "     Built in Delhi | GitHub: Vimal0501/Java-App-via-Jenkins-2     " + ANSI_RESET + "\n");
        
        spinner(10); // Fun loading animation
        
        // 👋 Greet
        Main app = new Main();
        String userName = args.length > 0 ? args[0] : "Bhavya";
        app.greet(userName);
        
        // 📋 Args with colors
        if (args.length > 0) {
            System.out.println(ANSI_BLUE + ANSI_BOLD + "🎯 Command-line Arguments:" + ANSI_RESET);
            for (int i = 0; i < args.length; i++) {
                System.out.println("   " + ANSI_YELLOW + "Arg[" + i + "]:" + ANSI_RESET + " " + ANSI_GREEN + args[i] + ANSI_RESET);
            }
        } else {
            System.out.println(ANSI_YELLOW + "ℹ️  No args? Try: java Main " + ANSI_GREEN + "test1 test2" + ANSI_RESET);
        }
        
        // ➕ Arithmetic with flair
        int x = 15, y = 5;
        System.out.println("\n" + ANSI_CYAN + "🧮 Arithmetic Playground:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + x + " + " + y + " = " + (x + y) + ANSI_RESET);
        System.out.println(ANSI_GREEN + x + " * " + y + " = " + (x * y) + ANSI_RESET);
        
        // 🔍 Factorial with ASCII triangle
        System.out.println("\n" + ANSI_PURPLE + "🔢 Factorial Fun (5!):" + ANSI_RESET);
        System.out.println("   /\n  / \\\n /   \\\n/ 120 \\"); // ASCII art
        System.out.println(ANSI_PURPLE + "Computed: " + app.factorial(5) + ANSI_RESET);
        
        // 📈 Progress demo
        System.out.println("\n" + ANSI_BOLD + "🚀 Jenkins Build Simulation:" + ANSI_RESET);
        for (int p = 0; p <= 100; p += 10) {
            progressBar(p);
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
        
        // 🛠️ Skills with emojis
        String[] skills = {"☕ Java", "📊 SQL", "🐛 Jenkins", "🌐 Git", "📮 Postman", "🔗 APIs"};
        System.out.println("\n" + ANSI_GREEN + ANSI_BOLD + "💎 Super Skills Arsenal:" + ANSI_RESET);
        for (String skill : skills) {
            System.out.println("   " + ANSI_CYAN + skill + ANSI_RESET);
        }
        
        // ⏰ Timestamp
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss"));
        System.out.println("\n" + ANSI_WHITE + "🕐 Timestamp: " + now + ANSI_RESET);
        
        // 🎊 Grand finale
        System.out.println("\n" + ANSI_RED + ANSI_BOLD + "🌈 Demo Complete! Ready for Jenkins Deploy! 🎉" + ANSI_RESET);
    }
}