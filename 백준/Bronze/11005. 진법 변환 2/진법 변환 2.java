import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        long N = scanner.nextLong(); // 10억보다 작거나 같은 자연수
        int B = scanner.nextInt(); // 2 ≤ B ≤ 36

        // N을 B진법으로 변환
        String result = convertToBase(N, B);

        // 결과 출력
        System.out.println(result);
    }

    private static String convertToBase(long N, int B) {
        StringBuilder sb = new StringBuilder();
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (N > 0) {
            sb.append(chars.charAt((int) (N % B)));
            N /= B;
        }

        return sb.reverse().toString();
    }
}