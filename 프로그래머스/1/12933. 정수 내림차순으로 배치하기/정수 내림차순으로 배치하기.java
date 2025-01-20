import java.util.*;

class Solution {
    public long solution(long n) {
        List<Character> chars = new ArrayList<>();
        
        while(n>0){
            chars.add((char)('0' + (n % 10)));
            n=n/10;
            
        }
        
        chars.sort(Collections.reverseOrder());
        
        StringBuilder sortedNumber = new StringBuilder();
        for (char c : chars) {
            sortedNumber.append(c);
        }

        return Long.parseLong(sortedNumber.toString()); // 결과 반환
    }
    
}