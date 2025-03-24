class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^0-9]", " ");

        String[] numbers = my_string.split(" ");

        for (String num : numbers) {
            if (!num.equals("")) {
                answer += Integer.parseInt(num);
            }
        }

        return answer;
    }
}
