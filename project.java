import java.util.*;

public class project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSubjects;
        double mark, totalMarks = 0, averagePercentage;

        System.out.print("Enter the number of subjects: ");
        numSubjects = in.nextInt();

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            mark = in.nextDouble();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }

            totalMarks += mark;
        }

        averagePercentage = totalMarks / numSubjects;
        String grade = calculateGrade(averagePercentage);

        System.out.println(" Result ---");
        System.out.println("Total Marks = " + totalMarks);
        System.out.printf("Average Percentage = %.2f%%\n", averagePercentage);
        System.out.println("Grade = " + grade);
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
