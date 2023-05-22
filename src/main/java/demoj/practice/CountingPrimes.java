package demoj.practice;
import java.util.*;
import java.io.*;
public class CountingPrimes {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        countPrimes(readInt(), readInt());
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
    static boolean isPrime (int x) throws IOException {
        boolean prime = true;
        if (x == 1) {
            prime = false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) prime = false;
        }
        return prime;
    }
    static int countPrimes (int a, int b) throws IOException{
        int c = 0; 
        for (int i = a; b >= i; i++) {
            if (isPrime(i) == true) c += 1;
        }
        System.out.println(c);
        return c;
    }
}
