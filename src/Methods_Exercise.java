import java.util.Scanner;

public class Methods_Exercise {
    public static void main(String[] args) {
        Scanner season = new Scanner(System.in);
        int number = 1;
        System.out.println("Please enter a season (1 = Spring, 2 = Summer, 3 = Fall, 4 = Winter");
        number = season.nextInt();

    }
    public static void printSpring() {
        System.out.println("The season is Spring, and the flowers are blooming!");
    }
    public static void printSummer() {
        System.out.println("The season is Summer, and it is getting hot!");
    }
    public static void printFall() {
        System.out.println("The season is Fall, and the leaves are falling!");
    }
    public static void printWinter() {
        System.out.println("The season is Winter, it is snowing!");
    }

}
