package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc20j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        
        if (s + 2*m + 3*l >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
