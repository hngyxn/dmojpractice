import java.util.*;
import java.io.*;
public class ccc16j3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s = readLine();
		int ans = 1;

		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				String a = s.substring(i, j);
				String b = new StringBuilder(a).reverse().toString();
				if (a.equals(b)) {
					ans = Math.max(ans, a.length());
				}
			}
		}

		System.out.println(ans);

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