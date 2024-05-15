import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int arr[][] = new int[num1][num2];
        int arr2[][] = new int[num1][num2];
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                int n = sc.nextInt();
                arr2[i][j] = n;
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print((arr[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}