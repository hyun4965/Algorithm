class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            String numStr = String.valueOf(array[i]);
            for(int j = 0; j < numStr.length(); j++) {
                if(numStr.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
