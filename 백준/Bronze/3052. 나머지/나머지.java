import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {  // 10개 입력받기
            int Num = sc.nextInt();
            arr[i] = (Num % 42);
        }
        for (int j = 0; j < 10; j++) { // 중복 체크 하기 
            boolean isUnique = true;
            for (int k = 0; k < j; k++) {
                if (arr[k] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}