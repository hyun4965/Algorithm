class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        // 장군 5
        //병정 3
        //일개미 1
        // 적은 수로 죽이자
        answer = hp/5 + hp%5/3 + hp%5%3;
        
        return answer;
    }
}