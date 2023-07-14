import java.util.*;
import java.io.*;
public class dmopc14c7p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt(), arr[] = new int[a];
		boolean increasing = true;
        int min = 0, max = 0;

		for(int i = 0; i < a; i++) {
			arr[i] = readInt();
		}
		
		for (int i = 0; i < a; i++) {
			if (arr[i] < arr[min]) min = i;
			if (arr[i] > arr[max]) max = i;
		}

		for (int i = min + 1; i <= max; i++) {
			if (arr[i-1] >= arr[i]) increasing = false;
		}

		if (min < max && increasing) {
			System.out.println(arr[max] - arr[min]);
		} else {
			System.out.println("unknown");
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