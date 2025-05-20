package Basics;
import java.util.Scanner;

public class functions {
    public static int factorial(int a){
        if(a==0)
            return 1;
        return a * factorial(a-1);
    }
    public static void main(String[] args) {
        try(Scanner numScanner = new Scanner(System.in)){
            System.out.println("Enter a number to get factorial! =");
            int a = numScanner.nextInt();
            System.out.println(factorial(a));
        }
    }
}