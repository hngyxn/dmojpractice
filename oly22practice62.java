import java.util.*;
import java.io.*;
public class oly22practice62 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();
        int max = 0;

        for (int x = 0; x < a; x++) {
            int count = 0;
            String str = readLine();
            String [] stringarray  = str.split("");
            int [] arr = new int [str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = Integer.parseInt(stringarray[i]);
                if (arr[i]%2 != 0) count += arr[i];
            }
            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
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
