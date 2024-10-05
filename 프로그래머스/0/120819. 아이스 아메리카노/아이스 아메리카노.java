class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int j = money;
        
        answer[0]=j/5500;
        answer[1]=money - answer[0] * 5500;
        
        return answer;
    }
}