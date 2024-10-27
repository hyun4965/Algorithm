import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque = new ArrayDeque<>();
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            deque.addLast(numbers[i]);
        }
        if (direction.equals("left")) {
            int a = deque.pollFirst();
            deque.addLast(a);
        } else if (direction.equals("right")) {
            int a = deque.pollLast();
            deque.addFirst(a);
        }
        for (int i = 0; i < numbers.length; i++) {
            answer[i]=deque.pollFirst();
        }
        return answer;
    }
}