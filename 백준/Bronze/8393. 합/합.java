import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        int result = 0;
        for (i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}