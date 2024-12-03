import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> result = new ArrayList<>();
        
        // 명예의 전당 
        PriorityQueue<Integer> hall = new PriorityQueue<>();
        
        // 매일 점수를 처리
        for (int s : score) {
            // 명예의 전당에 새로운 점수 추가
            hall.add(s);
            
            // 명예의 전당 크기가 k를 초과하면 최솟값 제거
            if (hall.size() > k) {
                hall.poll();
            }
            
            // 현재 명예의 전당 최솟값을 결과에 추가
            result.add(hall.peek());
        }
        
        // 결과를 배열로 변환 후 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

