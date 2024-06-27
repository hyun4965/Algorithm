import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = -1; // 초기 값은 -1로 설정 (불가능한 경우)

        // 최대한 5킬로그램 봉지를 많이 사용하는 방법을 고려
        for (int i = N / 5; i >= 0; i--) {
            int remainingWeight = N - (i * 5);
            if (remainingWeight % 3 == 0) {
                count = i + (remainingWeight / 3);
                break;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
