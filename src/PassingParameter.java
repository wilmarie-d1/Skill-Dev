import java.util.Scanner;

public class PassingParameter {
    public static void main(String[] args) {
        Scanner larger =  new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
        int largeNum = 1;
        System.out.println("Please enter a number between 1 and 100");
        number1 = larger.nextInt();
        System.out.println("Please enter another number between 1 and 100");
        number2 = larger.nextInt();
        largeNum = largerNumber(number1, number2);
        System.out.println("You entered the number " + number1 + " and " + number2);
        System.out.println("The larger number is " + largeNum);

    }

    public static int largerNumber(int a, int b) {
        return (Math.max(a, b));
//
    }
}
