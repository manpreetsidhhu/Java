
import java.math.BigInteger;
import java.util.Scanner;

public class Prime {

    public static boolean checkPrime(int n) {
        if (n <= Integer.MAX_VALUE) {
            if (n <= 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        BigInteger a = BigInteger.valueOf(n);
        return a.isProbablePrime(1);
    }

    public static int nextPrime(int n) {
        int nextPrime = n + 1;
        while (!checkPrime(nextPrime)) {
            nextPrime++;
        }
        return nextPrime;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number to check whether its prime or not : ");
            int a = sc.nextInt();
            if (checkPrime(a)) {
                System.out.println(a + " is a Prime Number");
            } else {
                System.out.println(a + " is not a Prime Number");
            }
            System.out.println("Next Prime Number is : " + nextPrime(a));
        }
    }
}
