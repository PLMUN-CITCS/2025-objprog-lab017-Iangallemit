import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        double studentScore = getStudentScoreFromUser();
        String studentGrade = determineLetterGrade(studentScore); 
        displayStudentGrade(studentGrade); 
    }
    public static double getStudentScoreFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
            System.out.print("Enter the student's score: ");
        }
        return scanner.nextDouble();
    }
    public static String determineLetterGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void displayStudentGrade(String grade) {
        System.out.println("The grade is: " + grade);
    }
}
