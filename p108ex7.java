import java.util.*;
import java.io.*;
public class p108ex7 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int t = readInt(), b = 100, count = 0;
        for (int i = 0; i < t; i++) {
            int a = readInt();
            if (a <= 30) System.out.println(38);
            else if (a > 30 && a <= 50) System.out.println(55);
            else if (a > 50 && a <= 100) System.out.println(73);
            else {
                while (b < a) {
                    b += 50;
                    count++;
                }
                System.out.println(73 + (24*count));
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