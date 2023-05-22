package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class hkccc08j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            String s = sc.next();
            while (true) {
                sum = 0;
                String[] arr = s.split("");
                for (int j = 0; j < s.length(); j++) {
                    sum += Integer.parseInt(arr[j]);
                }
                if (sum < 10) {
                    break;
                } else {
                    s = sum+"";
                }
            }
            
            System.out.println(sum);
        }
    }
}
