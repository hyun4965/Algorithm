import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int closestSum = 0;

        // 세 장의 카드를 선택하는 모든 조합을 검사
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int currentSum = arr[i] + arr[j] + arr[k];
                    // 현재 합이 M을 넘지 않으면서 가장 큰 값을 찾기
                    if (currentSum <= M && currentSum > closestSum) {
                        closestSum = currentSum;
                    }
                }
            }
        }

        System.out.println(closestSum);
        sc.close();

    }
}