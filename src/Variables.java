import java.awt.*;
import java.util.Date;

public class Variables {
    public static void main(String[] args) {
        //VARIABLES:
//        int age = 30, temperature = 20;
//        System.out.println(age);
//        System.out.println(temperature);

//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);

        //PRIMITIVE TYPES
        byte age = 30;
        long viewsCount = 123456789L;
        double price1 = 10.99;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = true;

        //REFERENCE TYPES
         byte Age = 30;
        Date now = new Date();
        now.getTime(); //returns the time component of this object
        System.out.println(now); //prints out the value

     //POINTS
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;

        //STRINGS
        String message ="Hello world" + "!!";
        message.endsWith("!!");
        message.startsWith("Hello");
        message.length();
        message.indexOf("e");
        message.toLowerCase();
        System.out.println();

        //ESCAPE SEQUENCE

        String hello = "Hello \"Wilmarie\"";
        System.out.println(hello);
        //c:\Windows\...
        String windows = "c:\tWindows\\...";
        System.out.println(windows);

        //Arrays
        int [] numbers = new int[7];
    }}
