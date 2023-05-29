package demoj.problems;
import java.util.Scanner;

public class wc15c1j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String a = sc.next();
        String b = sc.next();
        if (a.equals("WHITE") || b.equals("WHITE")) {
            if (a.equals("BLUE") || b.equals("BLUE")) {
                System.out.println("RED");
            } else if (a.equals("RED") || b.equals("RED")) {
                System.out.println("BLUE");
            }
        } else if (a.equals("BLUE") || b.equals("BLUE")) {
            if (a.equals("WHITE") || b.equals("WHITE")) {
                System.out.println("RED");
            } else if (a.equals("RED") || b.equals("RED")) {
                System.out.println("WHITE");
            }
        } else {
            if (a.equals("BLUE") || b.equals("BLUE")) {
                System.out.println("WHITE");
            } else {
                System.out.println("BLUE");
            }
        }
        sc.close();
    }
}
