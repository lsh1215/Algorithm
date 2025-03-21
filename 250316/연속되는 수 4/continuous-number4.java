import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int count = 1;
        int maxVal = 0;

        for(int i=1; i<n; i++){
            if(arr[i] - arr[i-1] > 0){
                count++;
            }
            else{
                maxVal = Math.max(maxVal,count);
                count = 1;
            }
        }

        System.out.println(Math.max(maxVal,count));
    }
}