import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();

        int diagonal = 1; // 현재 대각선의 번호
        int count = 0; // 현재까지 포함된 항의 총 개수

        // 몇 번째 대각선인지 찾기
        while (count < X) {
            count += diagonal;
            diagonal++;
        }

        // X번째 항이 위치한 대각선의 번호
        diagonal--;

        // 대각선에서의 순서를 찾기
        int positionInDiagonal = X - (count - diagonal);

        int numerator;
        int denominator;

        // 대각선 번호가 홀수인지 짝수인지에 따라 분자와 분모를 결정
        if (diagonal % 2 == 0) {
            numerator = positionInDiagonal;
            denominator = diagonal - positionInDiagonal + 1;
        } else {
            numerator = diagonal - positionInDiagonal + 1;
            denominator = positionInDiagonal;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
