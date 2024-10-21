import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        
        // 문자열을 한 문자씩 검사
        for (char c : my_string.toCharArray()) {
            // 숫자인 경우 리스트에 추가
            if (Character.isDigit(c)) {
                numbers.add(c - '0');  // 문자를 숫자로 변환하여 추가
            }
        }
        
        // 오름차순 정렬
        Collections.sort(numbers);
        
        return numbers;
    }
}
