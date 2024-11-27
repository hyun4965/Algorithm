import java.util.*;
//탐욕기법
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        int max = people.length-1;
        
        //사람 정렬
        Arrays.sort(people);
        
        for(int i=0; i<=max; max--){
            answer++;
            if(people[max] + people[i] <=limit){
                i++;
            }
        }
        
        return answer;
    }
}