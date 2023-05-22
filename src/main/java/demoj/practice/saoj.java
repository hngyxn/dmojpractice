package demoj.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class saoj {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long funni = (N%1000000000*(N+1)%1000000000*(2*N+1)%1000000000*(3*(long)Math.pow(N, 4)+6*(long)Math.pow(N, 3)-3*N+1)%1000000000/42)%1000000000;
        System.out.println(funni);
    }
}