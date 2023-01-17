import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 1st edge measurement: ");
        a = input.nextDouble();
        System.out.println("Enter your 2nd edge measurement: ");
        b = input.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Your triangle's hypotenuse is: " + c + "cm");
        double area = (a*b) / 2;
        System.out.println("Your triangle's area is: " + area + "cm2");

    }
}