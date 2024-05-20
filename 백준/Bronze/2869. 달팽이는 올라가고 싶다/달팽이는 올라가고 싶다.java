import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        // Calculate the number of days needed
        int days = (V - B - 1) / (A - B) + 1;

        System.out.print(days);
        sc.close();
    }
}