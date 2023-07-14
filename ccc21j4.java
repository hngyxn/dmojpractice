import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc21j4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int l = 0;
        int s = 0;
        int sInL = 0;
        int lInS = 0;
        int swaps = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (arr[i] == 'L') {
                l++;
            } else if (arr[i] == 'S'){
                s++;
            }
        }
        for (int i = 0; i < l; i++) {
            if (arr[i] == 'S') {
                sInL++;
            }
        }
        for (int i = str.length() - 1; i > str.length() - s - 1; i--) {
            if (arr[i] == 'L') {
                lInS++;
            }
        }
        swaps += Math.max(sInL, lInS);
        for (int i = l; i <= str.length()-s-1; i++) {
            if (arr[i] == 'L' || arr[i] == 'S') {
                swaps++;
            }
        }
        System.out.println(swaps);
    }
}
