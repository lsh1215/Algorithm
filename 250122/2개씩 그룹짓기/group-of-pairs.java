import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int[] sums = new int[n];

        for (int i = 0; i < n; i++) {
            sums[i] = nums[i] + nums[2 * n - i - 1];
        }

        Arrays.sort(sums);

        System.out.println(sums[n - 1]);
    }
}