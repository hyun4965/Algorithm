import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[i].length; j++){
                if(sizes[i][0] < sizes[i][1]){
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp; 
                }
            }
            list.add(sizes[i][0]);
            list2.add(sizes[i][1]);
        }

        
        Collections.sort(list);
        Collections.sort(list2);
        
        answer= list.get(list.size()-1) * list2.get(list2.size()-1);
        
        
        
        
        return answer;
    }
}