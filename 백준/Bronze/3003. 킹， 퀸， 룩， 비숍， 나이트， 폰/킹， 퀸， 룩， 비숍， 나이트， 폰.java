import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int arr2[] = { 1, 1, 2, 2, 2, 8 };
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr2[i] - arr[i];

        }
        for (int k = 0; k < 6; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}