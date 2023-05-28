package demoj.problems;
import java.util.Scanner;

public class wc15c2j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("A long time ago in a galaxy far away...");
        } else if (n == 2) {
            System.out.println("A long time ago in a galaxy far, far away...");
        } else if (n == 3) {
            System.out.println("A long time ago in a galaxy far, far, far away...");
        } else if (n == 4) {
            System.out.println("A long time ago in a galaxy far, far, far, far away...");
        } else {
            System.out.println("A long time ago in a galaxy far, far, far, far, far away...");
        }
        sc.close();
    }
}
