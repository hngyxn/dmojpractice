package demoj.practice;
import java.util.*;
import java.io.*;
public class p108ex8 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();
        for (int i = 0; i < a; i++) {
            int n = readInt();
            if (n <= 45 || n > 315) System.out.println("N");
            else if (n > 45 && n <= 135) System.out.println("E");
            else if (n > 135 && n <= 225) System.out.println("S");
            else System.out.println("W");
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
