import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        
        // 세 각의 합이 180이 아닌 경우 Error 출력
        if ((x + y + z) != 180) {
            bw.write("Error");
        } else {
            // 모든 각이 60이면 Equilateral 출력
            if (x == y && y == z) {
                bw.write("Equilateral");
            } 
            // 두 각이 같은 경우 Isosceles 출력
            else if (x == y || x == z || y == z) {
                bw.write("Isosceles");
            } 
            // 모든 각이 다를 경우 Scalene 출력
            else {
                bw.write("Scalene");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}