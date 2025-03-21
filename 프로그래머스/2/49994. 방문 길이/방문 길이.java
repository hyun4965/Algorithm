import java.util.*;
class Solution {
    public int solution(String dirs) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;

        for (char dir : dirs.toCharArray()) {
            int nx = x;
            int ny = y;

            switch (dir) {
                case 'U': ny++; break;
                case 'D': ny--; break;
                case 'R': nx++; break;
                case 'L': nx--; break;
            }
            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) {
                continue;
            }
            String path = x + "," + y + "," + nx + "," + ny;
            String reversePath = nx + "," + ny + "," + x + "," + y;

            visited.add(path);
            visited.add(reversePath); 

            x = nx;
            y = ny;
        }

        return visited.size() / 2;
    }
}