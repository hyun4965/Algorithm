class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        if (arr.length % 2 != 0) { 
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {  
                    arr[i] += n;
                }
            }
        } else {  // 배열 길이가 짝수인 경우
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) { 
                    arr[i] += n;
                }
            }
        }
        
        answer = arr;
        return answer;
    }
}
