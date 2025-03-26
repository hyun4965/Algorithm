import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] temp = myStr.split("[abc]"); // a, b, c로 분리
        List<String> list = new ArrayList<>();

        for (String str : temp) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }

        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return list.toArray(new String[0]);
    }
}
