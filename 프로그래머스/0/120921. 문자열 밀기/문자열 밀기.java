class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int cnt = 0;
        
        while(cnt < A.length()){
            if(A.equals(B)){
                break;
            }
            
            String last = A.substring(A.length() - 1, A.length());
            String first = A.substring(0, A.length() - 1);
            
            A = last + first;
            answer ++;
            cnt++;
        }
        
        if(answer == A.length() && !A.equals(B))
            answer = -1;
            
        return answer;
    }
}