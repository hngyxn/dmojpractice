import java.util.*;
import java.io.*;
public class hkccc15j3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), m = readInt();
		boolean [][] a = new boolean[n+1][n+1];
		for(int k = 1; k <= m; k++) {
			int r = readInt(), c = readInt();
			for(int i = 1; i <= n; i++) {
				a[r][i] = true;
			}

			for(int i = 1; i <= n; i++) {
				a[i][c] = true;
			}

			for(int i = 1; i <= n; i++) {
				int j = r+c-i;
				if(j >= 1 && j <= n) {
                    a[i][j] = true;
                }
			}

			for(int i = 1; i <= n; i++) {
				int j = i - (r-c);
				if(j >= 1 && j <= n) {
                    a[i][j] = true;
                }
			}
		}
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(!a[i][j]) {
                    ans++;
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