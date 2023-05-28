package demoj.problems;
import java.util.Scanner;
import java.util.Arrays;
@SuppressWarnings("resource")

public class ccc16s2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        if (scan.nextInt() == 1) {
            int n = scan.nextInt();
            int[] dmoj = new int[n];
            int[] peg = new int[n];

            for (int i = 0; i < n; i++) {
                dmoj[i] = scan.nextInt();
            }
            for (int g = 0; g < n; g++) {
                peg[g] = scan.nextInt();
            }

            Arrays.sort(dmoj);
            Arrays.sort(peg);

            for (int j = 0; j < n; j++) {
                if (peg[j] >= dmoj[j]) {
                    sum += peg[j];
                } else {
                    sum += dmoj[j];
                }
            }

        } else {
            int n = scan.nextInt();
            int[] dmoj2 = new int[n];
            int[] peg2 = new int[n];

            for (int i = 0; i < n; i++) {
                dmoj2[i] = scan.nextInt();
            }
            for (int g = 0; g < n; g++) {
                peg2[g] = scan.nextInt();
            }

            Arrays.sort(dmoj2);
            Arrays.sort(peg2);

            for (int k = 0; k < n / 2; k++) {
                int temp = peg2[k];
                peg2[k] = peg2[n - k - 1];
                peg2[n - k - 1] = temp;
            }

            for (int j = 0; j < n; j++) {
                if (peg2[j] >= dmoj2[j]) {
                    sum += peg2[j];
                } else {
                    sum += dmoj2[j];
                }
            }
        }
        System.out.println(sum);
    }
}