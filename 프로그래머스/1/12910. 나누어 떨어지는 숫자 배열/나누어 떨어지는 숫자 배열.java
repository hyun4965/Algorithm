import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        // divisor로 나누어 떨어지는 값들만 리스트에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }
        
        // 나누어 떨어지는 값이 없을 때 -1 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        
        // 오름차순 정렬
        Collections.sort(list);
        
        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

