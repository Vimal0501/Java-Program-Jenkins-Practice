public class Student {
    
    // Instance variables (fields)
    private String name;
    private int age;
    private String rollNo;
    private double gpa;
    
    // Constructor
    public Student(String name, int age, String rollNo, double gpa) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.gpa = gpa;
    }
    
    // Default constructor
    public Student() {
        this("Unknown", 0, "000", 0.0);
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getRollNo() {
        return rollNo;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    // Method to display student info
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("GPA: " + gpa);
    }
    
    // Method to check if student passed (GPA >= 2.0)
    public boolean isPassed() {
        return gpa >= 2.0;
    }
}