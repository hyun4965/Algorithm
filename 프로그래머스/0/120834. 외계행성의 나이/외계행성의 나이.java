class Solution {
    public String solution(int age) {
        String answer = "";
        String age2 = String.valueOf(age);
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'};
        for(int i=0;i<age2.length();i++){
            for(int j=0;j<arr.length;j++){
                int num = age2.charAt(i)-'0';
                if(num == j){
                    answer+=arr[j];
                }   
            }
            
        }
        return answer;
    }
}