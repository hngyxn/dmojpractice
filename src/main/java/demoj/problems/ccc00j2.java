package demoj.problems;
import java.util.*;
import java.io.*;
public class ccc00j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();
        int b = readInt();
        int count = 0;
        String allowed = "108";
        for (int i = a; i <= b; i++) {
            boolean haha = true;
            String str = "" + i;
            while (str.length() > 1) {
                if (allowed.contains(str.substring(0,1))) {
                    if (str.substring(0,1).equals(str.substring(str.length()-1, str.length()))) {
                        str = str.substring(1, str.length()-1);
                    }
                } else if (str.substring(0,1).equals("6") && str.substring(str.length()-1, str.length()).equals("9")) {
                    str = str.substring(1, str.length()-1);
                } else if (str.substring(0,1).equals("9") && str.substring(str.length()-1, str.length()).equals("6")) {
                    str = str.substring(1, str.length()-1);
                } else haha = false;
                if (!haha) break;
                
            }
            if (!allowed.contains(str)) haha = false;
            if (haha) count++;
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
