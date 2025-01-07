import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothingMap = new HashMap<>();

        // 1. 의상 종류별 개수 세기
        for (String[] cloth : clothes) {
            String type = cloth[1];
            clothingMap.put(type, clothingMap.getOrDefault(type, 0) + 1);
        }

        // 2. 조합 계산
        int answer = 1;
        for (int count : clothingMap.values()) {
            answer *= (count + 1); 
        }

        return answer - 1;
    }
}