import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if (h > 0) {
            if (m >= 45) {
                System.out.print(h + " " + (m - 45));
            } else {
                System.out.print((h - 1) + " " + (60 - (45 - m)));
            }
        } else {
            if (m >= 45) {
                System.out.print(h + " " + (m - 45));
            } else {
                System.out.print(23 + " " + (60 - (45 - m)));
            }
        }

    }
}
