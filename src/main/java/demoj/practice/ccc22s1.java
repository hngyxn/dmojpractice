package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc22s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= a; i += 4) {
            if ((a - i)%5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
