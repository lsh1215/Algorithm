import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = 0;
        int count = 1; // 최소 길이는 1이므로 0이 아닌 1로 시작

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxVal = Math.max(maxVal, count);
                count = 1; // 새로운 숫자가 나오면 길이를 1부터 다시 시작
            }
        }

        maxVal = Math.max(maxVal, count); // 마지막 그룹도 비교

        System.out.println(maxVal);
    }
}
