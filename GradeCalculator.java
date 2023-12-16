import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int subjectMarks = scanner.nextInt();

            // Ensure the entered marks are within a valid range (0-100)
            if (subjectMarks < 0 || subjectMarks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100. Please try again.");
                i--;  // Decrement i to re-enter marks for the same subject
            } else {
                totalMarks += subjectMarks;
            }
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);

        // Assign grades based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
