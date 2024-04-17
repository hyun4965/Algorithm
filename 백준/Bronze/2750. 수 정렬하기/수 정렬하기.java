import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열 개수 입력 받기
        int arr[] = new int[N]; // N개의 배열 만들기

        for (int t = 0; t < N; t++) {// 배열에 N개의 값 입력 받기
            arr[t] = sc.nextInt();
        }
        // 버블 정렬 사용.
        boolean swapped;
        for (int i = 0; i < N; i++) {
            swapped = false;
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        // 출력
        for (int k = 0; k < N; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}