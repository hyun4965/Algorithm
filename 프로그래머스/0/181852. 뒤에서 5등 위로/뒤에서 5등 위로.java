import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length-5];
        int k=0;
        Arrays.sort(num_list);
        
        for(int i=5; i<num_list.length;i++){
            answer[k++] = num_list[i];
        }
        
        return answer;
    }
}