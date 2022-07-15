import java.util.*;
import java.io.*;

public class hkccc15j3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int board = readInt();
        int queens = readInt();
        int tot = board*board;
        boolean[][] arr = new boolean[board][board];

        for (int i = 0; i < queens; i++) {
            int x = readInt();
            int y = readInt();
            for (int j = 0; j < board; j++) {
                if (!arr[j][y]) {
                    arr[j][y] = true;
                    tot--;
                }
                if (!arr[x][j]) {
                    arr[x][j] = true;
                    tot--;
                }
            }
            for (int j = 0; j < board-x; j++) {
                if (!arr[x+j][y+j]) {
                    arr[x+j][y+j] = true;
                    tot--;
                }
                if (!arr[x+j][y-j]) {
                    arr[x+j][y-j] = true;
                    tot--;
                }
            }
            for (int j = 0; j < x; j++) {
                if (!arr[x-j][y+j]) {
                    arr[x-j][y+j] = true;
                    tot--;
                }
                if (!arr[x-j][y-j]) {
                    arr[x-j][y-j] = true;
                    tot--;
                }
            }
        }

        System.out.println(tot);
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
