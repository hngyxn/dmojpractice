package demoj.problems;
import java.util.*;
import java.io.*;
public class ccc02j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		while (true) {
            String str = readLine();
            if (str.equals("quit!")) break;
            String[] arr = str.split("");
            if (arr.length > 4 && arr[arr.length-1].equals("r") && arr[arr.length-2].equals("o")) {
                if (arr[arr.length-3].equals("a") || arr[arr.length-3].equals("e") || arr[arr.length-3].equals("i") || arr[arr.length-3].equals("o") || arr[arr.length-3].equals("u") || arr[arr.length-3].equals("y")) {
                    System.out.println(str);
                } else {
                    for (int i = 0; i < arr.length-2; i++) {
                        System.out.print(arr[i]);
                    }
                    System.out.print(arr[arr.length-2]+ "u"  + arr[arr.length-1]);
                    System.out.println();
                }
            } else System.out.println(str);
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
