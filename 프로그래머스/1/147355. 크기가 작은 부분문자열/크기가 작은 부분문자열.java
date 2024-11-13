class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long num = Long.parseLong(p); 

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String s = t.substring(i, i + p.length());
            long subNum = Long.parseLong(s);
            if (subNum <= num) {
                answer++;
            }
        }
        return answer;
    }
}