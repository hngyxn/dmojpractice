import java.util.*;
import java.io.*;
public class oly22practice63 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		long a = readLong();
        long b = readLong();

        if (a > b) {
            long temp = b;
            b = a;
            a = temp;
        }
        long lcm = b;

        while (true) {
            if (lcm%a == 0 && lcm%b == 0) {
                System.out.println(lcm);
                break;
            }
            lcm += b;
        }
        
	}
    
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
