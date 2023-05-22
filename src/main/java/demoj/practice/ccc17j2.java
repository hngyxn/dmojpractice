package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc17j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = n;
        for (int i = 0; i < k; i++) {
            n *= 10;
            sum += n;
        }
        System.out.println(sum);
    }
}
