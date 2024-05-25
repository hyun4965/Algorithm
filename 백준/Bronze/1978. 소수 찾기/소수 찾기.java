import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 후 입력
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 소수 개수 구하기.
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
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