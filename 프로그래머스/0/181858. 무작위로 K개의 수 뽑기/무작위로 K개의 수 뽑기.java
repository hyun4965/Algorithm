import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> seq = new HashSet<>();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (!seq.contains(num)) {
                seq.add(num);
                answer[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }

        while (index < k) {
            answer[index++] = -1;
        }

        return answer;
    }
}
