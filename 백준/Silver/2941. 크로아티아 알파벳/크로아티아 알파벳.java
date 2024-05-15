import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] arr = {"c=", "c-", "dz=", "z=", "d-", "lj", "nj", "s="};

        for (String s : arr){
            str = str.replace(s, ",");
        }
        System.out.println(str.length());
    }
}