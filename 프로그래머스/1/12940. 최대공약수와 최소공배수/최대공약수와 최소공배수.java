class Solution {
    public int[] solution(int n, int m) {
        int[] answer =new int[2];
        int gcd = getGCD(n,m);
        int lcd = (n*m)/getGCD(n,m);
        answer[0]= gcd;
        answer[1]=lcd;
        return answer;
    }
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
            return getGCD(num2, num1%num2);
    }
}

