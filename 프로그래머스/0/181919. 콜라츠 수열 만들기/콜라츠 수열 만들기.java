import java.util.*;
class Solution {
    public int[] solution(int n) {
List<Integer> list = new ArrayList<>();
        
        // 초기값 n을 추가
        list.add(n);
        
        // n이 1이 될 때까지 콜라츠 수열 생성
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}