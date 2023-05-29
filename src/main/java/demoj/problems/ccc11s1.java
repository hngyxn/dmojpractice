package demoj.problems;
import java.util.*;
import java.io.*;
public class ccc11s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();
        int s = 0, t = 0;
        for (int i = 0; i < a; i++) {
            String str = readLine();
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 's' || arr[j] == 'S') {
                    s++;
                } else if (arr[j] == 't' || arr[j] == 'T') {
                    t++;
                }
            }
        }

        if (s >= t) {
            System.out.println("French");
        } else {
            System.out.println("English");
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
