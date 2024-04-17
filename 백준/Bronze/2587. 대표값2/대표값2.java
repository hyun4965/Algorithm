import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; // N개의 배열 만들기
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < 5; i++) {// 배열에 N개의 값 입력 받기
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            sum += arr[j];
        }
        avg = sum / 5;
        System.out.println(avg);

        for (int k = 0; k < 5; k++) {
            for (int m = 0; m < 4 - k; m++) {
                if (arr[m] > arr[m + 1]) {
                    int temp = 0;
                    temp = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = temp;
                }
            }
        }
        int midrange = arr[2];

        System.out.println(midrange);
        sc.close();
    }
}