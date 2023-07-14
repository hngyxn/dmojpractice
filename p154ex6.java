import java.util.*;
import java.io.*;
public class p154ex6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		double rate = readDouble();
        rate /= 100;
        rate += 1;
        double pop = readDouble();
        int year = readInt();
        int finalpop = readInt();

        while (true) {
            if (pop >= finalpop) {
                break;
            }
            pop *= rate;
            year++;
        }

        System.out.println(year);


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
