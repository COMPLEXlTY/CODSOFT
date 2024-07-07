import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.print("VLSI: ");
        int sub1 = scanner.nextInt();
        System.out.print("Machine Learning: ");
        int sub2 = scanner.nextInt();
        System.out.print("RDBMS: ");
        int sub3 = scanner.nextInt();

        
        int tot = sub1 + sub2 + sub3;
        
        double avgPer = (double) tot / 3; 
        
        char grade = calculateGrade(avgPer);

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
    


