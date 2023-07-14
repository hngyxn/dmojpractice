import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc07j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(),  b = sc.nextInt(), c = sc.nextInt();

        System.out.println(Math.max(Math.min(a,b), Math.min(Math.max(a,b),c)));
    }
}
