import java.util.*;
class Solution {
public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int m = 0; m < commands.length; m++) {
            int i = commands[m][0] - 1;  // 1-based index to 0-based
            int j = commands[m][1];      // j is inclusive
            int k = commands[m][2] - 1;  // 1-based index to 0-based

            // j - i로 배열 크기 계산, j가 inclusive이므로 복사할 때 j까지 포함
            int[] a = new int[j - i];
            for (int n = i; n < j; n++) {
                a[n - i] = array[n];
            }

            Arrays.sort(a);  // 정렬

            answer[m] = a[k];  // k는 이미 0-based로 처리됨
        }
        return answer;
    }
}