package demoj.problems;
import java.util.*;
import java.io.*;
public class coci08c2p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt();
        sour = new int[n];
        bitter = new int[n];
        for (int i = 0; i < n; i++) {
            sour[i] = readInt();
            bitter[i] = readInt();
        }
        for (int i = 0; i < n; i++) {
            recursion(i, 1, 0, new boolean[n]);
        }
        System.out.println(optimal);
	}

    public static void recursion(int current, int totalSour, int totalBitter, boolean[]used) {
        used[current] = true;
        totalSour *= sour[current];
        totalBitter += bitter[current];
        optimal = Math.min(optimal, Math.abs(totalSour - totalBitter));
        for (int i = 0; i < used.length; i++) {
            if (!used[i]) recursion(i, totalSour, totalBitter, used.clone());
        }
    }

    static int[]sour;
    static int[]bitter;
    static int optimal = Integer.MAX_VALUE;

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
