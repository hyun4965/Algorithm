import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int work : works) {
            maxHeap.offer(work);
        }

        while (n > 0 && !maxHeap.isEmpty()) {
            int current = maxHeap.poll();
            if (current > 0) {
                maxHeap.offer(current - 1);
            }
            n--;
        }

        long answer = 0;
        while (!maxHeap.isEmpty()) {
            int remaining = maxHeap.poll();
            answer += (long) remaining * remaining;
        }

        
        return answer;
    }
}