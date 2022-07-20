import java.util.*;
import java.io.*;
public class p100ex4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String str = readLine();
        if (str == "MG") System.out.println("midget girls");
        else if (str == "MB") System.out.println("midget boys");
        else if (str == "JG") System.out.println("junior girls");
        else if (str == "JB") System.out.println("junior boys");
        else if (str == "SG") System.out.println("senior girls");
        else if (str == "SB") System.out.println("senior boys");
        else System.out.println("invalid code");
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
