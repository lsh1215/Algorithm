import java.util.*;

public class Solution {
    public int solution(int n) {

        return sum(n);
    }
    
    public int sum(int n){
        if(n==0) return 0;
        return sum(n/10)+(n%10);    
    }
}