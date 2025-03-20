import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];

        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }

        int[] count = new int[n]; 

        
        for (int i = 0; i < m; i++) {
            int person = penalizedPerson[i];

            if (person >= 1 && person <= n) { 
                count[person - 1]++; // 1-based 인덱스 조정
            }
        }

        boolean found = false; // 벌금을 낸 학생이 있는지 확인하는 플래그

        
        for (int i = 0; i < n; i++) {
            if (count[i] >= k) {
                System.out.println(i + 1);
                found = true; 
            }
        }

        // 벌금을 낸 학생이 없으면 -1 출력
        if (!found) {
            System.out.println(-1);
        }
    }
}
