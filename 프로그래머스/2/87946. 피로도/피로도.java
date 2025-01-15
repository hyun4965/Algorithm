import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int maxDungeons = 0;
        int n = dungeons.length;
        boolean[] visited = new boolean[n];

        maxDungeons = dfs(k, dungeons, visited, 0);

        return maxDungeons;
    }

    private int dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        int maxCount = count;

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                maxCount = Math.max(maxCount, dfs(k - dungeons[i][1], dungeons, visited, count + 1));
                visited[i] = false; 
            }
        }

        return maxCount;
    }
}