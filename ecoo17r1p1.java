import java.util.*;
import java.io.*;
public class ecoo17r1p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		for (int i = 0; i < 10; i++) {
            int cost = readInt();
            double y1 = readDouble();
            double y2 = readDouble();
            double y3 = readDouble();
            double y4 = readDouble();
            int num = readInt();
            y1 *= num;
            y2 *= num;
            y3 *= num;
            y4 *= num;
            y1 = (int)y1;
            y2 = (int)y2;
            y3 = (int)y3;
            y4 = (int)y4;
            if (num - (y1 + y2 + y3 + y4) > 0) {
                if (y1 > y2 &&  y1 > y3 && y1 > y4) {
                    y1 += num - (y1 + y2 + y3 + y4);
                } else if (y2 > y3 && y2 > y4) {
                    y2 += num - (y1 + y2 + y3 + y4);
                } else if (y3 > y4) {
                    y3 += num - (y1 + y2 + y3 + y4);
                } else {
                    y4 += num - (y1 + y2 + y3 + y4);
                }
            }
            y1 *= 12;
            y2 *= 10;
            y3 *= 7;
            y4 *= 5;
            if(0.5*(y1 + y2 + y3 + y4) >= cost) System.out.println("NO");
            else System.out.println("YES");
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
