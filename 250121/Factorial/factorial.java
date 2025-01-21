import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        System.out.print(factorial(n));

    }

    public static long factorial(long n){
        if(n==1) return 1;
        return factorial(n-1) * n;
    }
}