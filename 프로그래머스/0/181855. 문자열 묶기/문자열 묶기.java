class Solution {
    public int solution(String[] strArr) {
        int[] lengthCount = new int[31]; 
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            lengthCount[len]++;
        }

        int max = 0;
        for (int count : lengthCount) {
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}
