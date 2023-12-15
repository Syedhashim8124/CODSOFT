import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] subjects = {"Math", "Physics", "Basic Electronics", "Electrical", "C++", "English", "Innovative Thinking Design"};
            int[] marks = new int[subjects.length];

            for (int i = 0; i < subjects.length; i++) {
                System.out.print("Enter the marks obtained in " + subjects[i] + " (out of 100): ");
                marks[i] = scanner.nextInt();
            }

            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }

            final double averagePercentage = (double) totalMarks / subjects.length;

            char grade;
            if (averagePercentage >= 90.0) {
                grade = 'A';
            } else if (averagePercentage >= 80.0) {
                grade = 'B';
            } else if (averagePercentage >= 70.0) {
                grade = 'C';
            } else if (averagePercentage >= 60.0) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);
        }
    }
}

