import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double arr[] = new double[num];
        double sum = 0;
        double max = arr[0];
        double avg = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextDouble();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int j = 0; j < num; j++) {
            arr[j] = (arr[j] / max) * 100;
            sum += arr[j];
        }
        avg = sum / num;
        System.out.println(avg);
        sc.close();
    }
}