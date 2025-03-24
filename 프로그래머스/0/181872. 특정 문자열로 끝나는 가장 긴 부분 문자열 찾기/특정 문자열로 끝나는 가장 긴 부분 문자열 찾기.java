class Solution {
    public String solution(String myString, String pat) {
        String result = "";
        for (int i = 0; i < myString.length(); i++) {
            String sub = myString.substring(0, i + 1);
            if (sub.endsWith(pat)) {
                result = sub;
            }
        }
        return result;
    }
}
