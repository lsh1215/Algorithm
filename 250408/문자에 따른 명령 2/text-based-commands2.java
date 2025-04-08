import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.

        // x+ , y- , x-, y+
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int nx = 0; 
        int ny = 0;
        
        int dirNum = 3;

        for(char c : s.toCharArray()){

            if(c == 'L'){
                dirNum = (dirNum + 3) % 4;
            }

            else if(c == 'R'){
                dirNum = (dirNum + 1) % 4;
            }

            else if(c == 'F'){
                nx += dx[dirNum];
                ny += dy[dirNum];

            }
        }

        System.out.println(nx + " " + ny);

    }
}