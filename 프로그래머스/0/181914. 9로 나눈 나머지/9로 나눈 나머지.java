class Solution {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int n = c - '0';  // char를 int로 변환
            answer += n;
        }
        return answer % 9;  // 9로 나눈 나머지 반환
    }
}
