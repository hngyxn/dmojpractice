import java.util.Scanner;
@SuppressWarnings("resource")

public class cspc1p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int according = sc.nextInt();
        int to = 0;
        int laws = 0;

        for(int all = 0; all < according; all++) {
            int known = sc.nextInt();
            if (known <= 14 && known >= 0) {
                to++;
            } else if (known < 0) {
                laws ++;
            }
        }
        int of = according - laws - to;

        if (to > 0) {
            if (to == 1) {
                System.out.println("1 person is too young to play.");
            } else {
                System.out.println(to + " people are too young to play.");
            }
        }
        
        if (of > 12) {
            System.out.println("There are too many people who want to play.");
        } else if (of < 12) {
            System.out.println("There are not enough people to play.");
        } else {
            System.out.println("Time to play!");
        }
    }
}