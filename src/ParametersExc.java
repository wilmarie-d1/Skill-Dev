import java.util.Scanner;

public class ParametersExc {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        double grade1;
        double grade2;
        double grade3;
        double gradeAvg;

        System.out.println("Please enter the grade between 1 and 100");
        grade1 = grades.nextDouble();
        System.out.println("Please enter the grade between 1 and 100");
        grade2 = grades.nextDouble();
        System.out.println("Please enter the grade between 1 and 100");
        grade3 = grades.nextDouble();
        System.out.println("You entered the grades: " + grade1 + ", " + grade2 + ", and " + grade3);
        gradeAvg = avgGrade(grade1, grade2, grade3);
        System.out.println("Your average grade is " + gradeAvg);

    }

    public static double avgGrade(double g1, double g2, double g3) {
        double sum = (g1 +g2 + g3)/3;
        return sum;
    }
}
