import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int FirstNum = 666;
        int count = 1;
        while (count != N) {
            FirstNum++;
            if (String.valueOf(FirstNum).contains("666")) {
                count++;
            }
        }
        System.out.println(FirstNum);
    }
}
