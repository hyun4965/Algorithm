import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> set1 = makeMultiSet(str1);
        List<String> set2 = makeMultiSet(str2);

        int intersection = 0;
        int union = 0;

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : set1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }
        for (String s : set2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }

        Set<String> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        for (String key : allKeys) {
            int count1 = map1.getOrDefault(key, 0);
            int count2 = map2.getOrDefault(key, 0);

            intersection += Math.min(count1, count2); 
            union += Math.max(count1, count2);     
        }

        double jaccard = (union == 0) ? 1 : (double) intersection / union;
        return (int) (jaccard * 65536);
    }

    private List<String> makeMultiSet(String str) {
        List<String> multiSet = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                multiSet.add("" + c1 + c2);
            }
        }
        return multiSet;
    }
}
