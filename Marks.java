import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.print("VLSI: ");
        int sub1 = scanner.nextInt();
        System.out.print("Machine Learning: ");
        int sub2 = scanner.nextInt();
        System.out.print("RDBMS: ");
        int sub3 = scanner.nextInt();

        // Calculate total marks
        int tot = sub1 + sub2 + sub3;

        // Calculate average percentage
        double avgPer = (double) tot / 3; // Assuming 3 subjects
        // Calculate grade
        char grade = calculateGrade(avgPer);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + tot);
        System.out.println("Average Percentage: " + avgPer + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    
    public static char calculateGrade(double avgPer) {
        if (avgPer >= 90) {
            return 'A';
        } else if (avgPer >= 80) {
            return 'B';
        } else if (avgPer >= 70) {
            return 'C';
        } else if (avgPer >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
    


