import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int range = 2;
        if (n == 1) {
            System.out.print(n);
        } else {
            while (n >= range) {
                range = range + (6 * count);
                count++;
            }
            System.out.print(count);
        }
    }
}