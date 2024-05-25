import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int numA = sc.nextInt();
            int numB = sc.nextInt();
            if (numA == 0 && numB == 0) {
                break;
            }
            if (numA % numB == 0) {
                System.out.println("multiple");
            } else if (numB % numA == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
        sc.close();
    }
}
