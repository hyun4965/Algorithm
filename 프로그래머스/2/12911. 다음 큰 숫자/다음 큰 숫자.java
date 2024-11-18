class Solution {
    public int solution(int n) {
        // 입력 숫자의 2진수에서 1의 개수를 계산
        int targetCount = Integer.bitCount(n);

        // 다음 숫자를 찾기 위해 n보다 큰 수를 하나씩 증가시키며 확인
        while (true) {
            n++;
            // 현재 숫자의 2진수에서 1의 개수가 targetCount와 같다면 반환
            if (Integer.bitCount(n) == targetCount) {
                return n;
            }
        }
    }
}
