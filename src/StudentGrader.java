import java.util.Scanner;

public class StudentGrader {

    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score";
        }
        if (score >= 90) return "A";
        if (score >= 80) return "B";
        if (score >= 70) return "C";
        if (score >= 60) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        int score = sc.nextInt();

        System.out.println("Grade: " + calculateGrade(score));

        sc.close();
    }
}