import java.util.*;

class Solution {
    public int solution(String word) {
        char[] chars = {'A', 'E', 'I', 'O', 'U'};
        int[] weight = {781, 156, 31, 6, 1};  
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            int idx = "AEIOU".indexOf(word.charAt(i));
            answer += idx * weight[i] + 1;
        }

        return answer;
    }
}
