import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            int quarter = n / 25;
            n %= 25;

            int dime = n / 10;
            n %= 10;

            int nickel = n / 5;
            n %= 5;

            int penny = n;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }

        sc.close();
    }
}