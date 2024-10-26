class Solution {
    public int solution(int n) {
        int answer = 1;

        while(true){
            if(6 * answer % n == 0) break; // 6조각 * 피자판수 % 사람수 == 0 멈춤
                answer++; // 피자판수 증가
        }
 
        return answer;

    }
}