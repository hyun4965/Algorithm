import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int[] arrayX = new int[4];
        int[] arrayY = new int[4];
        for (int i = 0; i < 4; i++) {
            arrayX[i] = dots[i][0];
            arrayY[i] = dots[i][1];
        }
        Arrays.sort(arrayX);
        Arrays.sort(arrayY);
        return (arrayX[3] - arrayX[0]) * (arrayY[3] - arrayY[0]);
    }
}