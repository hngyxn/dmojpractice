import java.util.*;
import java.io.*;
public class seed3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int i = readInt();
		int n = readInt();
		int j = readInt();
		int[] arr = new int[i+2];
		int unsafe = 0;

		for (int l = 0; l < j; l++) {
			int xi = readInt();
			int xf = readInt();
			int k = readInt();
			arr[xi] += k;
			arr[xf + 1] += -k;
		}
		for (int k = 1; k < arr.length-1; k++) {
			arr[k] += arr[k-1];
			if (arr[k] < n) unsafe++;
		}
		System.out.println(unsafe);
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
