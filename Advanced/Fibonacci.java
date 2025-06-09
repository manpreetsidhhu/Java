import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static BigInteger fibonacci(int n){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;
        if (n == 0) return a;
        if (n == 1) return b;
        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of element in fibbonacci Series : ");
            int n = sc.nextInt();
            if (n >1000) {
                System.out.println("Error: Fibonacci series generation for more than 1000 terms is not supported due to performance constraints.");
                return;
            }
            System.out.println(n+"th element in fibonacci series is : "+ fibonacci(n));
            for(int i=0;i<=n;i++){
                System.out.print(fibonacci(i)+" ");
            }
        }
    }
}