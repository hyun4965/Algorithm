import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int closest = array[0];
        int minDiff = Math.abs(n - array[0]);

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);

            if (diff < minDiff) {
                minDiff = diff;
                closest = array[i];
            } else if (diff == minDiff && array[i] < closest) {
                closest = array[i]; 
            }
        }

        return closest;
    }
}
