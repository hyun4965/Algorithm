class Solution {
    public String solution(int n) {
        String answer = "";
        char a = '수';
        char b = '박';
        for(int i=0; i<n;i++){
            if(i%2!=1){
                answer +=a;
            }else{
                answer+=b;
            }
        }
        return answer;
    }
}