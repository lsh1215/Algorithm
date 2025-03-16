import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int MAX_T = 1000000;
    public static int[] posA = new int[MAX_T+1];
    public static int[] posB = new int[MAX_T+1];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
      // A가 매 초마다 서있는 위치를 기록
        int timeA = 1;
        for(int i = 0; i < n; i++) {
            char d = sc.next().charAt(0); 
            int t = sc.nextInt();
            
            while(t-- > 0) {
                if(d == 'R')
                    posA[timeA] = posA[timeA - 1] + 1;
                else
                    posA[timeA] = posA[timeA - 1] - 1;
                
                timeA++;
            }
        }
        
        // B가 매 초마다 서있는 위치를 기록
        int timeB = 1;
        for(int i = 0; i < m; i++) {
            char d = sc.next().charAt(0); 
            int t = sc.nextInt();
            
            while(t-- > 0) {
                if(d == 'R')
                    posB[timeB] = posB[timeB - 1] + 1;
                else
                    posB[timeB] = posB[timeB - 1] - 1;
                
                timeB++;
            }
        }
        
        int meetTime = -1;

        for(int i=1; i<timeA; i++){
            if(posA[i] == posB[i]){
                meetTime = i;
                break;
            }
        }

        System.out.print(meetTime);
    }
}
