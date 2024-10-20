class Solution { 
    public int[] solution(String myString) {
        String[] splitStrings = myString.split("x", -1);
        
        int[] answer = new int[splitStrings.length];
        
        for (int i = 0; i < splitStrings.length; i++) {
            answer[i] = splitStrings[i].length();
        }
        
        return answer;
    }
}
