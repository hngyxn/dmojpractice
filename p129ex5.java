import java.util.*;
import java.io.*;
public class p129ex5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		char c = readCharacter();
        String str = readLine();
        System.out.println(str);
        String str2 = str.toLowerCase();
        char[] arr = str2.toCharArray();
        int i = 0;
        int count = 0;
        while (arr[i] != '.') {
            if (arr[i] == c) count++;
            i++;
        }
        System.out.println(count);
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
