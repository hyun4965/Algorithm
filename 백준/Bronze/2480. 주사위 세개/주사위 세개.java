import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int Score = 0;

        if (A == B && A == C) {
            Score = 10000 + (A * 1000);
        } else if (A == B || A == C) {
            Score = 1000 + A * 100;
        } else if (B == C) {
            Score = 1000 + B * 100;
        } else {
            Score = (A > B) && (A > C) ? A : (C > B ? C : B);
            Score *= 100;
        }
        System.out.println(Score);
    }
}