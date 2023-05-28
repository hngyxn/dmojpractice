package demoj.problems;
import java.util.*;
@SuppressWarnings("resource")
public class ecoo19r1p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            int events = sc.nextInt();
            int days = sc.nextInt();
            sc.nextLine();

            int[] eDays = new int[events];
            for(int e = 0; e < events; e++){
                eDays[e] = sc.nextInt();
            }


            int sum = 0;

            int cleanShirts = n;

            for (int d = 1; d <= days; d++) {
                if(cleanShirts == 0){
                    sum++;
                    cleanShirts = n;

                }

                cleanShirts--;


                for(int v = 0; v < eDays.length; v++){
                    if(d == eDays[v]) {
                        cleanShirts++;
                        n++;
                    }
                }




            }
            System.out.println(sum);
        }
    }
}