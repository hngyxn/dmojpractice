import java.util.Scanner;

public class oly19practice59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int [a];
        int maxcount = 0;
        int mostfreq = 0;

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            int count = 0;
            for (int j = 0; j < a; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxcount) {
                maxcount = count;
                mostfreq = arr[i];
            } else if (count == maxcount && arr[i] < mostfreq) {
                mostfreq = arr[i];
            }
        }

        System.out.println(mostfreq);
        sc.close();
    }
}
