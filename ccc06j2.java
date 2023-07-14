import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc06j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int fifteen = sc.nextInt();
        int burger = sc.nextInt();
        for (int king = 1; king <= fifteen; king++) {
            for (int foot = 1; foot <= burger; foot++) {
                if (foot + king == 10) {
                    number++;
                }
            }
        }
        if (number == 1) {
            System.out.println("There is " + number + " way to get the sum 10.");
        } else {
            System.out.println("There are " + number + " ways to get the sum 10.");
        }
    }
}
