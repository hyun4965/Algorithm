class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; 
        java.util.Map<Character, Integer> lastSeen = new java.util.HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); 
            
            if (lastSeen.containsKey(currentChar)) {
                answer[i] = i - lastSeen.get(currentChar); 
            } else {
                answer[i] = -1; 
            }
            
            lastSeen.put(currentChar, i);
        }
        
        return answer;
    }
}
