class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = 0;

        for (int sec : section) {
            if (sec > lastPainted) {  
                answer++;  // 페인트칠 횟수 증가
                lastPainted = sec + m - 1; 
            }
        }
        
        return answer;
    }
}
