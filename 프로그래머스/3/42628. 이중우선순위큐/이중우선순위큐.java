import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();

        for (String op : operations) {
            String[] parts = op.split(" ");
            String cmd = parts[0];
            int num = Integer.parseInt(parts[1]);

            if (cmd.equals("I")) {
                minpq.offer(num);
                maxpq.offer(num);
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else if (cmd.equals("D")) {
                if (map.isEmpty()) {
                    continue;
                }
                if (num == 1) {
                    remove(maxpq, map);
                } else if (num == -1) {
                    remove(minpq, map);
                }
            }
        }

        int max = top(maxpq, map);
        int min = top(minpq, map);

        if (map.isEmpty()) {
            return new int[]{0, 0};
        }
        return new int[]{max, min};
    }

    private void remove(PriorityQueue<Integer> pq, Map<Integer, Integer> map) {
        while (!pq.isEmpty()) {
            int value = pq.poll();
            if (map.containsKey(value)) {
                int count = map.get(value);
                if (count == 1) {
                    map.remove(value);
                } else {
                    map.put(value, count - 1);
                }
                break;
            }
        }
    }

    private int top(PriorityQueue<Integer> pq, Map<Integer, Integer> map) {
        while (!pq.isEmpty()) {
            int value = pq.peek();
            if (map.containsKey(value)) {
                return value;
            }
            pq.poll();
        }
        return 0;
    }
}
