import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numberList.add(num);
            if (i % 2 == 0) {
                Collections.sort(numberList);
                System.out.print(numberList.get(i / 2) + " ");
            }
        }
    }
}