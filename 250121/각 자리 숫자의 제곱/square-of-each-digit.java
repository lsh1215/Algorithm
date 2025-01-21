import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(SumSquare(n));
    }

    public static long SumSquare(long n) {
        if (n == 0) {
            return 0;
        }
        return (long) (SumSquare(n / 10) + Math.pow(n % 10, 2));
    }
}