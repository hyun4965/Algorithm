class Solution {
    public String solution(String my_string) {
    String answer = "";

    for (int i = 0; i < my_string.length(); i++) {
        char c = my_string.charAt(i); // my_string에서 문자를 가져옵니다.
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            answer += c; // 모음이 아닐 때만 answer에 추가합니다.
        }
    }
    return answer;
    }
}