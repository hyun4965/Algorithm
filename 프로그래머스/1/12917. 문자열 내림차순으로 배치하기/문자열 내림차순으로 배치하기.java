import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자열을 문자 배열로 변환
        char[] charArray = s.toCharArray();
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(charArray);
        
        // 내림차순으로 정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder answer = new StringBuilder(new String(charArray));
        
        // 내림차순으로 바꾸기 위해 reverse() 사용
        return answer.reverse().toString();
    }
}
