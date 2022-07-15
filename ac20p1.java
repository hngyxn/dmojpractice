import java.util.Scanner;
@SuppressWarnings("resource")

public class ac20p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();

            long min = Math.min(a, Math.min(b, c));
            long max = Math.max(a, Math.max(b, c));
            long med = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));

            if (min*min + med*med > max*max) {
                System.out.println("A");
            } else if (min*min + med*med == max*max) {
                System.out.println("R");
            } else {
                System.out.println("O");
            }
        }
     }
}
