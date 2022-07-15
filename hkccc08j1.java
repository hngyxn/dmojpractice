import java.util.Scanner;
@SuppressWarnings("resource")

public class hkccc08j1 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int best1 = 0;
        int best2 = 0;
        int f1 = 0;
        int f2 = 0;
        int tot = 0;

        for (int i = 0; i < a; i++) {
            f1 = sc.nextInt();
            f2 = sc.nextInt();
            tot = f1*f2;
            if (tot > best1) {
                best1 = tot;
            }
        }

        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            f1 = sc.nextInt();
            f2 = sc.nextInt();
            tot = f1*f2;
            if (tot > best2) {
                best2 = tot;
            }

        }

        if (best1 > best2) {
            System.out.println("Casper");
        } else if (best1 < best2) {
            System.out.println("Natalie");
        } else {
            System.out.println("Tie");
        }


    }
}
