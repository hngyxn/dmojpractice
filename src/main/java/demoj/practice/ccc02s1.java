package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc02s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pink = sc.nextInt();
        int green = sc.nextInt();
        int red = sc.nextInt();
        int orange = sc.nextInt();
        int total = sc.nextInt();
        int comb = 0;
        int heehee = 100000000;
        int min = 0;

        for (int i = 0; i <= total; i++) {
            for (int j = 0; j <= total; j++) {
                for (int k = 0; k <= total; k++) {
                    for (int l = 0; l <= total; l++) {
                        if (i*pink + j*green + k*red + l*orange == total) {
                            if (min < heehee) {
                                min = i+j+k+l;
                                heehee = min;
                            }
                            System.out.print("# of PINK is " + i);
                            System.out.print(" # of GREEN is " + j);
                            System.out.print(" # of RED is " + k);
                            System.out.print(" # of ORANGE is " + l);
                            System.out.println();
                            comb++;
                        }
                    }
                }
            }
        }

        System.out.println("Total combinations is " + comb + ".");
        System.out.println("Minimum number of tickets to print is " + min + ".");

    }
}
