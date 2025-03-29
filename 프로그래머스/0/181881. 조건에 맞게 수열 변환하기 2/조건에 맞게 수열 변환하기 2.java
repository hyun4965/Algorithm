import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            boolean changed = false;
            int[] newArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num >= 50 && num % 2 == 0) {
                    newArr[i] = num / 2;
                } else if (num < 50 && num % 2 == 1) {
                    newArr[i] = num * 2 + 1;
                } else {
                    newArr[i] = num;
                }

                if (newArr[i] != arr[i]) {
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }

            arr = newArr; 
            count++;
        }

        return count;
    }
}
