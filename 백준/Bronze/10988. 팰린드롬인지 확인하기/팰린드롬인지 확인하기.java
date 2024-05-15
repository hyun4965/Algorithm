import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();

        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}