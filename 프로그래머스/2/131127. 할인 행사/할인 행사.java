import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }


        for (int i = 0; i <= discount.length - 10; i++) {

            Map<String, Integer> currentMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                currentMap.put(discount[j], currentMap.getOrDefault(discount[j], 0) + 1);
            }


            boolean isMatch = true;
            for (String key : wantMap.keySet()) {
                if (currentMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                answer++;
            }
        }

        return answer;
    }
}
