class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisorCount = new int[number + 1]; 

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCount[j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            if (divisorCount[i] > limit) {
                answer += power;
            } else {
                answer += divisorCount[i];
            }
        }

        return answer;
    }
}