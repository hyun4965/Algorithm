import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] counting = new int[10]; // 각 자리수의 빈도를 저장하는 배열
        int N = sc.nextInt();

        // 각 자리수의 빈도를 계산
        while (N != 0) {
            int digit = N % 10;  // 마지막 자리수
            counting[digit]++;   // 해당 자리수의 빈도 증가
            N /= 10;             // 마지막 자리수 제거
        }

        // 내림차순으로 출력
        for (int k = 9; k >= 0; k--) {
            for (int j = 0; j < counting[k]; j++) {
                System.out.print(k);
            }
        }
    }
}