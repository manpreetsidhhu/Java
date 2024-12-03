
import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator:");
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter the operation:");
        Scanner sc1 = new Scanner(System.in);
        String op = sc1.nextLine();
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
        sc.close(); sc1.close();
    }
}