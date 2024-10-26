import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }
        
        // List<Integer> answer를 int[]로 변환
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}
