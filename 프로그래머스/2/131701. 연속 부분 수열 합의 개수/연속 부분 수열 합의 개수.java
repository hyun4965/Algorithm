import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        // 결과를 저장할 Set (중복 제거)
        Set<Integer> uniqueSums = new HashSet<>();

        int n = elements.length;
        // 원형 수열 처리를 위해 배열을 두 배로 늘림
        int[] circularArray = new int[2 * n];
        for (int i = 0; i < n; i++) {
            circularArray[i] = elements[i];
            circularArray[i + n] = elements[i];
        }

        // 각 길이의 연속 부분 수열 합 계산
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int k = 0; k < length; k++) {
                    sum += circularArray[start + k];
                }
                uniqueSums.add(sum);
            }
        }

        // 중복을 제거한 고유 합의 개수 반환
        return uniqueSums.size();
    }
}