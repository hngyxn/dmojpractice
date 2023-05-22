package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ecoo21p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int check = sc.nextInt();
        int message = sc.nextInt();

        if (message > start + (check*3)) {
            System.out.println("Who knows...");
        }

        for (int i = start + check; i <= start + (check * 3); i += check) {
            if (message <= i) {
                System.out.println(i);
                i = start + (check * 3) + 1;
            }
        }
    }
}
