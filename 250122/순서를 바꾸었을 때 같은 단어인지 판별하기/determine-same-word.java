import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String fString = sc.nextLine();
        String sString = sc.nextLine();

        char[] fchars = fString.toCharArray();
        char[] schars = sString.toCharArray();

        Arrays.sort(fchars);
        Arrays.sort(schars);
        
        if (Arrays.equals(fchars, schars)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}