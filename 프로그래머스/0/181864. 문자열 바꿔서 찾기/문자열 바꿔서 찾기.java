class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else if (c == 'B') {
                sb.append('A');
            }
        }

        // 2. 바뀐 문자열에서 pat 부분 문자열이 존재하는지 확인합니다.
        if (sb.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}