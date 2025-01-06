import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> pocket = new HashSet<>();
        for (int num : nums) {
            pocket.add(num); 
        }
        
        int max = nums.length / 2; 
        int count = pocket.size(); 
        

        return Math.min(max,count);
    }
}