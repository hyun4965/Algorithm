import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A); 
        Integer[] B_Integer = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            B_Integer[i] = B[i];
        }

        Arrays.sort(B_Integer, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B_Integer[i];
        }

        return answer;
    }
}
