import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char c : rotated.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) isValid = false;

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}
