class Solution {
    public String solution(String s) {
        String answer = "";
        int k = s.length()/2;
        if(s.length()%2==0 ){
            answer+=s.charAt(k-1);
            answer+=s.charAt(k);
        }else{
            answer += s.charAt(k);
        }
        
        return answer;
    }
}