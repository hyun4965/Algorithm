import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우, -1만 포함된 배열을 리턴
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 가장 작은 수와 해당 인덱스를 찾음
        int small = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
                index = i;
            }
        }

        // 가장 작은 수를 제외한 배열 생성
        int[] answer = new int[arr.length - 1];
        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j != index) {
                answer[k++] = arr[j];
            }
        }

        return answer;
    }
}
