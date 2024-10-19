class Solution {
    public String[] solution(String[] names) {
        int num = (names.length % 5 == 0) ? 0 : 1;
        String[] answer = new String[names.length/5+num];
        for(int i=0; i<answer.length; i++){
            answer[i] = names[5*i];
        }
        return answer;


    }
}