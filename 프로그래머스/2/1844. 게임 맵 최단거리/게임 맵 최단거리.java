import java.util.*;

public class Solution {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        // 시작점 추가 (x, y, 이동 거리)
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];

            if (x == n - 1 && y == m - 1) {
                return count;
            }

            // 네 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                // 범위 내에 있고, 방문하지 않았으며 벽이 아닌 경우 이동 가능
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && !visited[nextX][nextY] && maps[nextX][nextY] == 1) {
                    visited[nextX][nextY] = true;
                    queue.offer(new int[]{nextX, nextY, count + 1});
                }
            }
        }

        // 상대 팀 진영에 도달할 수 없는 경우
        return -1;
    }
}
