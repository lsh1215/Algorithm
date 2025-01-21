import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SplitToOne(n);
        System.out.println(count);
    }

    public static int SplitToOne(int n) {

        if (n == 1) {
            return 0;
        }

        count += 1;

        if (n % 2 == 0) {
            return SplitToOne(n / 2);
        } else {
            return SplitToOne(n / 3);
        }
    }
}