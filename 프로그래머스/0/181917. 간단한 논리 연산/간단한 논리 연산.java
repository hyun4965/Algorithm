class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        if(x1 == true || x2==true ){
            if(x3 == true || x4 == true){
                return true;
            }
        }
        
        return false;
    }
}