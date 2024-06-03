// Count Sort
import java.io.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a >= 1 && a <= 10000)
                count[a]++;
        }

        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < count[i]; j++) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
    }
}