class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0]; // 시작 인덱스
            int end = parts[i][1];   // 끝 인덱스
            
            // 부분 문자열 추출하고 이어 붙이기
            result.append(my_strings[i].substring(start, end + 1));
        }
         
        return result.toString();
    }
}