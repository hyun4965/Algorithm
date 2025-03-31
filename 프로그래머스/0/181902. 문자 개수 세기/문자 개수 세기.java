class Solution {
    public int[] solution(String my_string) {
        int[] alpha = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                alpha[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                alpha[c - 'a' + 26]++;
            }
        }

        return alpha;
    }
}
