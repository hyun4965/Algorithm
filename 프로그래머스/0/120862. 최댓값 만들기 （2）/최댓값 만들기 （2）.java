import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열을 정렬
        int n = numbers.length;
        // 가장 큰 두 수의 곱 또는 가장 작은 두 음수의 곱 중 더 큰 값을 반환
        return Math.max(numbers[n - 1] * numbers[n - 2], numbers[0] * numbers[1]);
    }
}
