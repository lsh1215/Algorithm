import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 초기 위치
        int x = 0, y = 0;

        // 방향 순서: N, E, S, W
        int[] dx = {0, 1, 0, -1}; // x 변화
        int[] dy = {1, 0, -1, 0}; // y 변화

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            int dirIndex = -1;
            if (direction == 'N') dirIndex = 0;
            else if (direction == 'E') dirIndex = 1;
            else if (direction == 'S') dirIndex = 2;
            else if (direction == 'W') dirIndex = 3;
            else {
                System.out.println("[ERROR] 잘못된 방향 입력: " + direction);
                return;
            }

            x += dx[dirIndex] * distance;
            y += dy[dirIndex] * distance;
        }

        System.out.println(x + " " + y);
    }
}
