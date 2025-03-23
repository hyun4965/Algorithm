class Solution { 
    public int solution(int i, int j, int k) {
        int answer = 0;
        String key = String.valueOf(k); 

        for (int m = i; m <= j; m++) {
            String numStr = String.valueOf(m); 
            for (int n = 0; n < numStr.length(); n++) {
                if (String.valueOf(numStr.charAt(n)).equals(key)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
