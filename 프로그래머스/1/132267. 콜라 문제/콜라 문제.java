class Solution {
    //빈병 a개 -> 새 콜라 b개
    //a = 마트에 주어야하는 빈 병의 수
    //b = a를 가져다 주면 마트에서 주는 새 콜라의 수
    //n = 상빈이의 빈 병의 개수
    public static int solution(int a, int b, int n) {
        int answer = 0;
        // n은 현재 상빈이가 가진 빈 병의 수
        while (n >= a) {
            int exchanged = (n / a) * b; // 교환으로 얻은 콜라 병 수
            int remainder = n % a; // 교환 후 남은 빈 병 수
            answer += exchanged; // 얻은 콜라를 합산
            n = exchanged + remainder; // 새로운 빈 병 수
        }
        return answer;
    }
}