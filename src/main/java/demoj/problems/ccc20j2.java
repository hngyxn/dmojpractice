package demoj.problems;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc20j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int p = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();
        int tot = 0;

        int day = 0;
        
        while (tot <= p) {
            tot += n;
            n *= r;
            day++;
        }
        
        System.out.println(day-1);
    }
}
