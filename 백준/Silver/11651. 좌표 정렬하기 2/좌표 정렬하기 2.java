import java.io.*;
import java.util.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }

        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.y != p2.y) {
                    return Integer.compare(p1.y, p2.y);
                } else {
                    return Integer.compare(p1.x, p2.x);
                }
            }
        });

        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}