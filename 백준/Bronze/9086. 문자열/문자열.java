import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine(); 

        String arr[] = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLine();
        }

        for (int j = 0; j < num; j++) {
            if (arr[j].length() > 0) { 
                System.out.println(arr[j].charAt(0) + "" + arr[j].charAt(arr[j].length() - 1));
            } else {
                System.out.println(""); 
            }
        }
    }
}