class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            StringBuilder sub = new StringBuilder(sb.substring(s, e + 1));
            sub.reverse();

            sb.replace(s, e + 1, sub.toString());
        }

        return sb.toString();
    }
}
