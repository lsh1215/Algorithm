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

        int count = 0;

        int maxTime = Math.max(listA.size(), listB.size());

        for (int t = 1; t <= maxTime; t++) {
            int prevPosA = (t - 1 < listA.size()) ? listA.get(t - 1) : listA.get(listA.size() - 1);
            int prevPosB = (t - 1 < listB.size()) ? listB.get(t - 1) : listB.get(listB.size() - 1);
            int curPosA = (t < listA.size()) ? listA.get(t) : listA.get(listA.size() - 1);
            int curPosB = (t < listB.size()) ? listB.get(t) : listB.get(listB.size() - 1);


            if (curPosA == curPosB && prevPosA != prevPosB) {
                count++;
            }
        }

        System.out.println(count);        
        
    }
}