import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 전체 학생 수
        int m = sc.nextInt(); // 벌금을 받은 학생 수
        int k = sc.nextInt(); // 벌금 기준 횟수
        int[] count = new int[n]; // 각 학생의 벌금 횟수 저장 (0-based index)

        // 벌금을 받은 학생들의 정보 입력
        for (int i = 0; i < m; i++) {
            int person = sc.nextInt();

            if (person >= 1 && person <= n) { // 유효한 학생 번호인지 확인
                count[person - 1]++; // 1-based 인덱스 조정
            }
        }

        boolean found = false; // 벌금을 낸 학생이 있는지 확인하는 플래그

        // k번 이상 벌금을 낸 학생 출력
        for (int i = 0; i < n; i++) {
            if (count[i] >= k) {
                System.out.println(i + 1); // 1-based 출력
                found = true; // 최소 한 명이라도 출력했음을 표시
            }
        }

        // 벌금을 낸 학생이 없으면 -1 출력
        if (!found) {
            System.out.println(-1);
        }
    }
}
