class Solution {
    public int[] solution(int[] num_list) {
        int count = num_list.length;
        
        int[] answer = new int[count + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (num_list[count - 1] > num_list[count - 2]) {
            answer[count] = num_list[count - 1] - num_list[count - 2];
        } else {
            answer[count] = num_list[count - 1] * 2;
        }
        
        return answer;
    }
}
