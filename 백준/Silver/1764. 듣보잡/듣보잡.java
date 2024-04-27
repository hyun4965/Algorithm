import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> data = new HashSet<>();
        LinkedList<String> result = new LinkedList<>();
        String temp;

        //듣도 못한 사람
        for(int i = 0; i<n; i++)
        {
            temp = sc.next();
            data.add(temp);
        }


        //보도 못한 사람
        for(int i = 0; i<m; i++)
        {
            temp = sc.next();
            if(data.contains(temp))
            {
                result.push(temp);
            }
        }
        System.out.println(result.size());
        result.stream().sorted().forEach((x)->System.out.println(x));
    }
}