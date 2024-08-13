import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 입력
        int T = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        // 각 테스트 케이스에 대해 VPS 판단
        for (int i = 0; i < T; i++) {
            String ps = sc.nextLine(); // 괄호 문자열 입력
            int balance = 0;
            boolean isValid = true;

            // 괄호 문자열을 한 문자씩 처리
            for (char c : ps.toCharArray()) {
                if (c == '(') {
                    balance++; // 여는 괄호일 때 balance 증가
                } else if (c == ')') {
                    balance--; // 닫는 괄호일 때 balance 감소
                    if (balance < 0) {
                        isValid = false; // balance가 음수면 유효하지 않음
                        break;
                    }
                }
            }

            // 전체 처리가 끝난 후 balance가 0이면 유효함
            if (balance != 0) {
                isValid = false;
            }

            // 결과 출력
            System.out.println(isValid ? "YES" : "NO");
        }

        sc.close(); // Scanner 닫기
    }
}
