class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;        
        int count = k;
        int index = 0;
        while(count>0){
            if(index >= numbers.length){
                index %= numbers.length;
            }
            answer = numbers[index];
            index +=2;
            count--;
        }
        
        return answer;
    }
}