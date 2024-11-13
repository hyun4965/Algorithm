class Solution {
    public int solution(int n) {
        int answer = 0;
        outerLoop: 
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = i; j <= n; j++) { 
                count += j;
                if (count == n) {
                    answer++;
                    continue outerLoop;
                } else if (count > n) {
                    continue outerLoop; 
                }
            }
        }
        return answer;
    }
}
