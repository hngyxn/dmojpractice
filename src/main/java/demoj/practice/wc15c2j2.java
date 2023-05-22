package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class wc15c2j2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int w = scan.nextInt();
            if (w <= m) {
                count += w;
            }
        }
        System.out.println(count);
    }
}
