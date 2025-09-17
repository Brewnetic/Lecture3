public class PrintExercise {
    public static void main(String[] args) {

        // Part 1: Same Line Output
        // Fill in the blanks to create this output: Hello World! Welcome to Java.
        
        System.out.____("Hello ");
        System.out.____("World! ");
        System.out.____("Welcome to Java.");


        // Part 2: Multiple Line Output
        // Fill in the blanks to create this output:
        // Student: John
        // Grade: 95
        // Status: Pass
        
        String student = "John";
        int grade = 95;
        
        System.out.____("Student: " + student);
        System.out.____("Grade: " + grade);  
        System.out.____("Status: Pass");
        
        
        // Part 3: Formatted Output
        // Fill in the blanks using printf to create this output:
        // Name: Alice    Age: 22    GPA: 3.75
        
        String name = "Alice";
        int age = 22;
        double gpa = 3.75;
        
        System.out.____("Name: ____    Age: ____    GPA: ____\n", ____, ____, ____);
        
        
        // Part 4: Output Prediction
        // What will this code output? Write your answer below:
        System.out.print("Java ");
        System.out.print("is ");
        System.out.println("awesome!");
        System.out.println("Let's code!");
        
        // Output: ________________________________
        //         ________________________________
        
        
        // Part 5: Real-World Formatting
        // Fix this code to display the price properly formatted as: $12.50
        double price = 12.498;
        
        // Current (wrong) code:
        System.out.println("Price: $" + price);
        
        // Fixed code using printf:
        System.out.____("Price: $____\n", ____);
        
    }
}