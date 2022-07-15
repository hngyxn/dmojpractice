import java.util.Scanner;

public class ccc01j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = i*2; j < a*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a-2; i > 0; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = i*2; j < a*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}