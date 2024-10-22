import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        // 약수를 담을 리스트 생성
        List<Integer> divisorList = new ArrayList<>();
        
        // n의 약수를 구해서 리스트에 추가
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorList.add(i);
            }
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[divisorList.size()];
        for (int i = 0; i < divisorList.size(); i++) {
            answer[i] = divisorList.get(i);
        }
        
        return answer;
    }
}
