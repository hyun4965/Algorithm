class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }

        for (int i = 0; i < overwrite_string.length(); i++) {
            answer.append(overwrite_string.charAt(i));
        }

        for (int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}
