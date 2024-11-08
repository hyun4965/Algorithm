class Solution {
    public long solution(int price, int money, int count) {
        // 총 이용 요금을 저장할 변수
        long totalCost = 0;
        
        // count 번 이용할 때의 총 비용 계산
        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }
        
        // 부족한 금액 계산
        long shortage = totalCost - money;
        
        // 부족하지 않으면 0을, 부족하면 부족한 금액 반환
        return shortage > 0 ? shortage : 0;
    }
}
