import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();

        System.out.println(N * (N - 1) / 2);
        System.out.println(2);
    }
}