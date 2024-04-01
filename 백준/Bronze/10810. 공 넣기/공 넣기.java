import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N + 1]; 

        for (int a = 1; a <= M; a++) { 
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 
            int k = sc.nextInt();
            for (int num = i; num <= j; num++) { 
                basket[num] = k; 
            }
        }

        for (int b = 1; b <= N; b++) {
            if (basket[b] != 0) {
                System.out.print(basket[b] + " ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}