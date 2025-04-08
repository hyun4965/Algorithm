class Solution {
    public int solution(String[] spell, String[] dic) {
        int dic_len = dic.length;
        int spell_len = spell.length;
            
        int answer = 0;
        int count = 0;
        
        for (int i=0; i<dic_len; i++){
            count = 0;
            for(int j=0; j<spell_len;j++){
                if(dic[i].contains(spell[j])){
                    count++;
                }
                
                if(count == spell_len){
                    answer = 1; //존재 O
                    return answer;
                }else{
                    answer = 2; //존재 X
                }
                
            }
        }
        return answer;
    }
}