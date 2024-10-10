class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n/10 !=0){
            int k=n%10;
            answer += k;
            n=n/10;
        }
        answer +=n%10;
        
        return answer;
    }
}