import java.util.Scanner;
public class wc15c4j2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] arr = new boolean[9];
        int count = 0;

        for(int i = 0;i < str.length()-1;i++) {
            if(str.substring(i,i+2).equals("00")) {
                String temp = String.valueOf(str.charAt(i+2));
                if(temp.matches("[0-9]")) {
                    int n = Integer.parseInt(temp);
                        if(n > 0) {
                            if(!arr[n - 1]) {
                                arr[n-1] = true;
                                count++;
                            }
                        }
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}