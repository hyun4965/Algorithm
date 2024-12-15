class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			String orBinaryStr = Integer.toBinaryString(arr1[i] | arr2[i]);
			while(orBinaryStr.length() < n) {
				orBinaryStr = " "+orBinaryStr;
			}
			orBinaryStr = orBinaryStr.replaceAll("1", "#").replaceAll("0", " ");
			answer[i] = orBinaryStr;
		}
        
        return answer;
    }
}