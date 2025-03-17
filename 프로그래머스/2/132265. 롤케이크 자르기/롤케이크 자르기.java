import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> leftSet = new HashSet<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        // 오른쪽 부분 
        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }

        // 왼쪽 부분 
        for (int i = 0; i < topping.length - 1; i++) {
            leftSet.add(topping[i]); 
            rightMap.put(topping[i], rightMap.get(topping[i]) - 1);

            if (rightMap.get(topping[i]) == 0) {
                rightMap.remove(topping[i]);
            }
            
            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }
}