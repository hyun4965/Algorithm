class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastNum = 0; 
        
        String[] elements = s.split(" ");
        
        for (String element : elements) {
            if (element.equals("Z")) {

                answer -= lastNum;
            } else {
                int num = Integer.parseInt(element);
                answer += num;
                lastNum = num;
            }
        }
        
        return answer;
    }
}
