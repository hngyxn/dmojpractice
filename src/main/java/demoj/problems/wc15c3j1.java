package demoj.problems;
import java.util.Scanner;
@SuppressWarnings("resource")

public class wc15c3j1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        int ab = scan.nextInt();
        int db = scan.nextInt();
        int as = scan.nextInt();
        int ds = scan.nextInt();
        
        if (ab > ds && db > as) {
            System.out.println("Batman");
        } else if (ab < ds && db < as) {
            System.out.println("Superman");
        } else {
            System.out.println("Inconclusive");
        }
    }
}
