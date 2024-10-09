class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int numA=1;
        int numB=0;
        
        for(int i=0; i<num_list.length; i++){
            numA *=num_list[i];
        }
        
        for(int i=0; i<num_list.length; i++){
            int k =num_list[i];
            numB +=k;
        }
        int m= numB;
        numB =m*m;
        
        if(numA<numB){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}