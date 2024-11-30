class Solution {
public static String solution(int[] food) {
        int[] arr = new int[food.length];
        String answer = "";
        arr[0]=1;
        for(int i=1; i<food.length; i++){
            arr[i] = food[i]/2;
        }
        for(int i=1; i<arr.length; i++){
            int count = arr[i];
            while(count>0){
                answer+=i;
                count--;
            }
        }
        answer+=0;
        for(int j=arr.length-1; j>0; j--){
            int count = arr[j];
            while(count>0){
                answer+=j;
                count--;
            }
        }
        return answer;
    }
}