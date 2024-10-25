import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int count =0;
        for(int i=0; i<sides.length-1;i++){
            count += sides[i];
        }
        if(sides[sides.length-1]>=count){
            return 2;
        }else{
            return 1;
        }
    }
}