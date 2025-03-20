class Solution {
    public String solution(int n, int t, int m, int p) {
        
        StringBuilder answer = new StringBuilder();
        StringBuilder sequence = new StringBuilder();
        int num = 0;
        
        while (sequence.length() < t * m) {
            sequence.append(Integer.toString(num++, n).toUpperCase());
        }
        
        for (int i = 0; i < t; i++) {
            answer.append(sequence.charAt((p - 1) + (i * m)));
        }
        
        return answer.toString();
    }
}