import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[9][9];
        int max = arr[0][0];
        int m = 0, k = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = sc.nextInt();
                arr[i][j] = n;
                if (n >= max) {
                    max = n;
                    m = i;
                    k = j;
                }
            }
        }
        System.out.println(max);
        System.out.print((m + 1) + " " + (k + 1));

        sc.close();
    }
}