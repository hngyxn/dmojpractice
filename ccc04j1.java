import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc04j1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("The largest square has side length " + (int)Math.floor(Math.sqrt(a)) + ".");
    }
}
