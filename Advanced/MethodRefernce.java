
import java.util.Arrays;
import java.util.List;

public class MethodRefernce {
    public static int a = 1;
    public static void print(String s) {
        System.out.println((a++) + ") " + s);
    }
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","banana","mango","watermelon","pineapple", "kiwi");
        System.out.println("List of fruits :");
        // class::method (method reference)
        fruits.forEach(MethodRefernce::print);
        // or by using lambda expressiona also
        // fruits.forEach(x -> print(x));
    }
}
