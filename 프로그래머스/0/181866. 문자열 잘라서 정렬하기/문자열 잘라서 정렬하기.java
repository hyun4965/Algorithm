import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] splitArray = myString.split("x");
        
        ArrayList<String> list = new ArrayList<>();
        for (String str : splitArray) {
            if (!str.isEmpty()) { 
                list.add(str);
            }
        }

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}
