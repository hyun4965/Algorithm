import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] sets = s.split("-");

        Arrays.sort(sets, Comparator.comparingInt(String::length));

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (String set : sets) {
            for (String num : set.split(",")) {
                int number = Integer.parseInt(num);
                if (!seen.contains(number)) {
                    seen.add(number);
                    result.add(number);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
