import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == -1) {
                break;
            }

            int[] arr = new int[N / 2];
            int sum = 0;
            int count = 0;

            for (int i = 1; i <= N / 2; i++) {
                if (N % i == 0) {
                    arr[count] = i;
                    sum += i;
                    count++;
                }
            }

            if (sum == N) {
                System.out.print(N + " = ");
                for (int i = 0; i < count; i++) {
                    System.out.print(arr[i]);
                    if (i < count - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
        sc.close();
    }
}