import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int k = sc.nextInt();  

        String T = sc.next();  

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String currentString = sc.next();
            if (currentString.startsWith(T)) {
                strings.add(currentString);
            }
        }

        // Sort the matching strings
        Collections.sort(strings);
        // Check if we have at least k matching strings
        System.out.println(strings.get(k - 1));
    }

}
