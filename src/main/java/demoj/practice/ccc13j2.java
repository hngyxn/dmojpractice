package demoj.practice;
import java.util.*;
import java.io.*;
public class ccc13j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int nope = 0;
		String str = readLine();
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'S' || arr[i] == 'H' || arr[i] == 'Z' || arr[i] == 'X' || arr[i] == 'N') {
                nope++;
            }
        }
        if (nope == arr.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
