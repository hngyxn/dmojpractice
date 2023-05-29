package demoj.problems;
import java.util.Scanner;
@SuppressWarnings("resource")

public class wc15c4j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int g = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int f = sc.nextInt();
            if (f%g == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
