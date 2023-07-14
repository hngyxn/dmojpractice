import java.util.*;
import java.io.*;
public class ccc01j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int x = readInt();
        int m = readInt();
        int n = 1;
        boolean haha = false;
        while (n < m) {
            if ((n*x) % m == 1) {
                System.out.println(n);
                haha = true;
                break;
            } else {
                n++;
            }
        }
        if (!haha) System.out.println("No such integer exists.");

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
