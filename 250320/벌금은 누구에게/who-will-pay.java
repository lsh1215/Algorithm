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

    
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i == penalizedPerson[j]){
                    count[i] += 1;
                }
            }
            if(count[i] - k >= 0)
                    System.out.println(i);
        }
    }
}