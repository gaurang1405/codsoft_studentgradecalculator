import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        int numSubjects = 0;
        int[] marks = null;
        int total = 0;
        double average = 0.0;
        String grade = "";

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Student Grade Calculator!");

        // Input: number of subjects
        System.out.print("How many subjects do you have? ");
        numSubjects = scanner.nextInt();

        
        marks = new int[numSubjects];

        // Input: Marks in each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        // Calculate Average Percentage
        average = (double) total / numSubjects;

        // Grade Calculation
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display Results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks      : " + total);
        System.out.println("Average Percentage: " + String.format("%.2f", average) + "%");
        System.out.println("Grade            : " + grade);

        scanner.close();

        System.out.println("Thank you for using the Student Grade Calculator. Good luck in your studies!");
    }
}

