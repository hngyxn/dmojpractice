package demoj.problems;
import java.util.*;
import java.io.*;
public class p154ex7 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		
        int a = readInt();
        int b = readInt();

        for (int i = a; i <= b; i++) {
            if (Math.pow((i/100)%10, 3) + Math.pow((i/10)%10, 3) + Math.pow(i%10, 3) == i) {
                System.out.println(i);
            }

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
