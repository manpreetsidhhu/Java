
import java.util.*;

public class day1 {
    public static void main(String[] args) {
        System.out.println("Calculator:");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 2nd number:");
        int b = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the operation:");
        String op = sc3.nextLine();
        if (op.equals("+")) {
            System.out.println("The sum is: " + (a + b));
        } else if (op.equals("-")) {
            System.out.println("The difference is: " + (a - b));
        } else if (op.equals("*")) {
            System.out.println("The product is: " + (a * b));
        } else if (op.equals("/")) {
            System.out.println("The quotient is: " + (a / b));
        } else {
            System.out.println("Invalid operation");
        }
    }
}