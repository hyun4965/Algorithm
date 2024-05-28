import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();

        System.out.println(((N) * (N - 1) * (N - 2)) / 6);
        System.out.println(3);
    }
}