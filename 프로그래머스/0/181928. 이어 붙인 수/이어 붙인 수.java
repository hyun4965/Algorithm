class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for (int num : num_list) {
            if (num % 2 == 0) {
                even += String.valueOf(num); // 짝수일 때
            } else {
                odd += String.valueOf(num); // 홀수일 때
            }
        }

        int oddNumber = Integer.parseInt(odd); // 홀수 이어 붙인 수
        int evenNumber = Integer.parseInt(even); // 짝수 이어 붙인 수

        return oddNumber + evenNumber; // 두 수의 합
    }
}