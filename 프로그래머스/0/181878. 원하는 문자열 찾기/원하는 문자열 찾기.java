class Solution {
    public int solution(String myString, String pat) {
        String s = myString.toLowerCase();
        String p = pat.toLowerCase();
        
        if(s.contains(p)){
            return 1;
        }else{
            return 0;
        }
    }
}