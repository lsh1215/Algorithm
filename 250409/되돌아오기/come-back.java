import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // x+ , y-, x-, y+
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};

        int nx = 0;
        int ny = 0;
        int dirNum = 0;
        int time = 0;

        int n = sc.nextInt();

        int flag = -1;        

        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            if(dir == 'E'){
                dirNum = 0;
            }
            else if(dir == 'S'){
                dirNum = 1;
            }
            else if(dir == 'W'){
                dirNum = 2;
            }
            else if(dir == 'N'){
                dirNum = 3;
            }

            for(int j=0; j<dist; j++){
                nx += dx[dirNum];
                ny += dy[dirNum];
                time++;

                if(nx == 0 && ny == 0 && time != 0 && flag == -1){
                    flag = time;
                    break;
                }
            }

        }
        // Please write your code here.
        
        System.out.println(flag);

    }
}