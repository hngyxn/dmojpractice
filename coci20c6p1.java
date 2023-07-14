import java.util.*;
import java.io.*;
public class coci20c6p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), m = readInt();
		char a[][] = new char[n][m], b[][] = new char[n][m];
		for(int i = 0; i<n; i++) {
			a[i] = readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				b[i][j] = '.';
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(a[i][j] == '#') {
					b[i][j] = '#'; b[i][j+1] = '#';
					b[i+1][j] ='#'; b[i+1][j+1] = '#';
				}
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
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