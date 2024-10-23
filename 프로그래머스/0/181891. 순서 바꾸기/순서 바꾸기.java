import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        Deque<Integer> deque = new ArrayDeque<>();

        int[] answer = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            deque.addLast(num_list[i]);
        }
        for(int i=0; i<n; i++){
            deque.addLast(deque.pollFirst());
        }
        for(int i=0; i<num_list.length; i++){
            answer[i] = deque.pollFirst();
        }
        return answer;
    }
}