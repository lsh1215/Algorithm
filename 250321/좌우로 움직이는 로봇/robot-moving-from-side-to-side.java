import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        listA.add(0); // 초기 위치
        listB.add(0); // 초기 위치

        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            int direct = 1;

            if(d =='L'){
                direct = -1;
            }

            while(t-- > 0){
                int lastElement = listA.get(listA.size() - 1);
                listA.add(lastElement + direct);
            }

        }
        

        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            int direct = 1;

            if(d =='L'){
                direct = -1;
            }

            while(t-- > 0){
                int lastElement = listB.get(listB.size() - 1);
                listB.add(lastElement + direct);
            }
        }

        int count = -1;

        for(int i=0; i<listA.size()-1; i++){
            if(listA.get(i) == listB.get(i))
                count += 1;
        }

        System.out.println(count);        
        
    }
}