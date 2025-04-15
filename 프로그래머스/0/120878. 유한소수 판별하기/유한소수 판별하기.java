class Solution {
    public int solution(int a, int b) {
        int remainderB = b/gcd(a,b);
        while(remainderB !=1){
            if(remainderB%2==0){
                remainderB/=2;
            }else if(remainderB %5 ==0){
                remainderB/=5;
            }else{
                return 2;
            }                
        }
        return 1;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}