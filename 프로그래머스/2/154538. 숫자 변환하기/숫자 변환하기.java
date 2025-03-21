import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] visited = new int[y + 1]; 
        Arrays.fill(visited, -1);   

        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == y) {
                return visited[current]; 
            }
            int[] nexts = {current + n, current * 2, current * 3};
            for (int next : nexts) {
                if (next <= y && visited[next] == -1) {
                    visited[next] = visited[current] + 1;
                    queue.add(next);
                }
            }
        }

        return -1; 
    }
}
