package demoj.practice;
import java.util.*;
import java.io.*;
public class ccc15j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String str = readLine();
        int happy = 0, sad = 0;
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ':' && arr[i+1] == '-') {
                if (arr[i+2] == ')') {
                    happy++;
                } else if (arr[i+2] == '(') {
                    sad++;
                }
            }
        }

        if (happy == 0 && sad == 0) System.out.println("none");
        else if (sad > happy) System.out.println("sad");
        else if (sad < happy) System.out.println("happy");
        else if (happy == sad) System.out.println("unsure");
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
