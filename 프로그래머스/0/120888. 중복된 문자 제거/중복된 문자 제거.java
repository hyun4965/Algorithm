import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        
        for (char ch : my_string.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                answer.append(ch);
            }
        }
        
        return answer.toString();
    }
}
