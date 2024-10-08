import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Array to store marks
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;

        // Input: Take marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Ensure the marks are valid
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid input. Please enter marks between 0 and 100: ");
                marks[i] = scanner.nextInt();
            }

            // Sum up the marks
            totalMarks += marks[i];
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Grade Calculation
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
