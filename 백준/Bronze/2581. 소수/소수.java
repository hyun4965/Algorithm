import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 후 입력
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean foundPrime = false;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (!foundPrime || i < min) {
                    min = i;
                }
                foundPrime = true;
            }
        }

        if (foundPrime) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

    public static boolean isPrime(int num) {
        // 1은 소수가 아님
        if (num <= 1) {
            return false;
        }

        // 2는 소수
        if (num == 2) {
            return true;
        }

        // 짝수는 소수가 아님
        if (num % 2 == 0) {
            return false;
        }

        // 제곱근까지 검사하여 소수 판별
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}