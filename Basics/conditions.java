package Basics;
import java.util.*;

public class conditions {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in); Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Calculator:");
            System.out.println("Enter 1st number:");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number:");
            int b = sc.nextInt();
            System.out.println("Enter the operation:");
            String op = sc1.nextLine();
            switch (op) {
                case "+" -> System.out.println("The sum is: " + (a + b));
                case "-" -> System.out.println("The difference is: " + (a - b));
                case "*" -> System.out.println("The product is: " + (a * b));
                case "/" -> System.out.println("The quotient is: " + (a / b));
                default -> System.out.println("Invalid operation");
            }
        }
    }
}