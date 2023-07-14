import java.util.*;
import java.io.*;
public class ccc21s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int m = readInt(), n = readInt(), k = readInt();
        int [] row = new int[m+1], col = new int[n+1];
        
        for (int i = 1; i <= k; i++) {
            char op = readCharacter();
            int id = readInt();
            if (op == 'R') {
                row[id]++;
            } else {
                col[id]++;
            }
        }
        
        int even = 0, odd = 0;
        
        for (int i = 1; i <= n; i++) {
            if (col[i] % 2 != 0) {
                odd++;
            } else {
                even++;
            }
        }
        
        int ans = 0;
        
        for (int i = 1; i <= m; i++) {
            if (row[i] % 2 != 0) {
                ans += even;
            } else {
                ans += odd;
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