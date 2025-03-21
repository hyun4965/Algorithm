import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int currentBox = 1;
        int i = 0;

        while (true) {
            if (i >= order.length) {
                break;
            }
            if (currentBox == order[i]) {
                currentBox++;
                i++;
                answer++;
            } else if (!stack.isEmpty() && stack.peek() == order[i]) {
                stack.pop();
                i++;
                answer++;
            } else if (currentBox <= order.length) {
                stack.push(currentBox);
                currentBox++;
            } else {
                break;
            }
        }

        return answer;
    }
}
