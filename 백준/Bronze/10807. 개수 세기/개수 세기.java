import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int find = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (find == arr[i])
                count += 1;
        }
        System.out.println(count);
        sc.close();
    }
}