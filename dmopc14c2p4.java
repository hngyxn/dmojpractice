import java.util.*;
import java.io.*;
public class dmopc14c2p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt();
        int[] arr = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            arr[i] = readInt();
        }

        for(int i = 2; i < n+1; i++) {
            arr[i] += arr[i-1];
        }

        int q = readInt();
        for (int i = 0; i < q; i++) {
            int start = readInt();
            int finish = readInt();
            System.out.println(sum(arr, start, finish));
        }
    }

    public static Integer sum(int[]psa, int s, int f) {
        int sum = psa[f+1] - psa[s];
        return sum;
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
