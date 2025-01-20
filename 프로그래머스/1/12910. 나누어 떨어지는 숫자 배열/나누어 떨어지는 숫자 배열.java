import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor == 0) {
                answerList.add(a);
            }
        }
        
        if (answerList.isEmpty()) {
            return new int[] {-1};
        }
        
        // 리스트를 배열로 변환 및 정렬
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}
