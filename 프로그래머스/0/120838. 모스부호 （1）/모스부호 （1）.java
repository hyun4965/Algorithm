import java.util.*;

class Solution {
    public String solution(String letter) {
        // 모스부호를 알파벳으로 매핑하는 Map 생성
        Map<String, String> morseMap = new HashMap<>();
        String[] morseArr = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        
        // 알파벳 a~z와 모스부호를 매핑
        for (int i = 0; i < morseArr.length; i++) {
            char letterChar = (char) ('a' + i);
            morseMap.put(morseArr[i], String.valueOf(letterChar));
        }

        // 공백 기준으로 모스부호 분리
        String[] morseLetters = letter.split(" ");
        StringBuilder result = new StringBuilder();

        // 각 모스부호를 알파벳으로 변환
        for (String morse : morseLetters) {
            result.append(morseMap.get(morse));
        }

        return result.toString();
    }
}
