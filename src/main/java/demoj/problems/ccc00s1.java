package demoj.problems;
import java.util.*;
import java.io.*;
public class ccc00s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int quarters = readInt();
        int slot1 = readInt();
        int slot2 = readInt();
        int slot3 = readInt();
        int count = 0;
        while (quarters > 0) {
            if(quarters > 0) {
                quarters--;
                count++;
                slot1++;
                if (slot1 == 35) {
                    quarters += 30;
                    slot1 = 0;
                }
            }

            if(quarters > 0) {
                quarters--;
                count++;
                slot2++;
                if (slot2 == 100) {
                    quarters += 60;
                    slot2 = 0;
                }
            }

            if(quarters > 0) {
                quarters--;
                count++;
                slot3++;
                if (slot3 == 10) {
                    quarters += 9;
                    slot3 = 0;
                }
            }
        }

        System.out.println("Martha plays " + count + " times before going broke.");
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
