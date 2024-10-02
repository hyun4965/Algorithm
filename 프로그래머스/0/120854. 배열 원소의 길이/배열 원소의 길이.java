class Solution {
    public int[] solution(String[] strlist) {
        int[] arr = new int[strlist.length];
        for(int i=0; i<strlist.length;i++){
            int n = strlist[i].length();
            arr[i] = n;
        }
        
        return arr;
    }
}