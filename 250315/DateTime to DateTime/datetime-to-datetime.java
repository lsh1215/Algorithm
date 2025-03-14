import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int inputMinutes = (A * 24 * 60) + (B * 60) + C;
        int baseMinutes = (11 * 24 * 60) + (11 * 60) + 11;


        if(inputMinutes < baseMinutes)
            System.out.println(-1);
        else
            System.out.println(inputMinutes - baseMinutes);
        
    }
}