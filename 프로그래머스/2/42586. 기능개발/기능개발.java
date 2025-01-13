import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int)Math.ceil((100.0-progresses[i])/speeds[i]));        
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= current) {
                count++;
                queue.poll();
            }

            answer.add(count);
        }

        int[] arr = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            arr[i] = answer.get(i);
        }
        return arr;
    }
}