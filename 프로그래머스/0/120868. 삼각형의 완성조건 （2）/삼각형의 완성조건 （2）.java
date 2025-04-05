class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int min = Math.min(a, b);
        return 2 * min - 1;
    }
}
