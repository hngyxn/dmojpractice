import java.util.*;
import java.io.*;
public class ac20p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int t = readInt();
        for (int i = 0; i < t; i++) {
            long a = readLong(), b = readLong(), c = readLong();

            long min = Math.min(a, Math.min(b, c));
            long max = Math.max(a, Math.max(b, c));
            long med = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));

            if (min*min + med*med > max*max) {
                System.out.println("A");
            } else if (min*min + med*med == max*max) {
                System.out.println("R");
            } else {
                System.out.println("O");
            }
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
