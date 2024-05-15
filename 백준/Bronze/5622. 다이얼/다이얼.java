import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 입력
        // A 아스키 코드 값 : 65
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'C') {
                sum += 3;
            } else if (s.charAt(i) >= 'D' && s.charAt(i) <= 'F') {
                sum += 4;
            } else if (s.charAt(i) >= 'G' && s.charAt(i) <= 'I') {
                sum += 5;
            } else if (s.charAt(i) >= 'J' && s.charAt(i) <= 'L') {
                sum += 6;
            } else if (s.charAt(i) >= 'M' && s.charAt(i) <= 'O') {
                sum += 7;
            } else if (s.charAt(i) >= 'P' && s.charAt(i) <= 'S') {
                sum += 8;
            } else if (s.charAt(i) >= 'T' && s.charAt(i) <= 'V') {
                sum += 9;
            } else if (s.charAt(i) >= 'W' && s.charAt(i) <= 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}