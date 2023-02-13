import java.util.*;
import java.io.*;
public class ccc00s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int m = readInt();
        ArrayList<Double> streams = new ArrayList<Double>();

        for (int i = 0; i < m; i++) {
            streams.add(readDouble());
        }

        while(true) {
        int a = readInt();
		if (a == 99) {
            int stream = readInt();
            double split = readDouble();
            streams.add(stream-1, streams.get(stream-1)*(split/100));
            streams.set(stream, streams.get(stream)*(1-(split/100)));
        } else if (a == 88) {
            int stream = readInt();
            streams.set(stream-1, streams.get(stream-1) + streams.get(stream));
            streams.remove(stream);
        } else if (a == 77) {
            for (int i = 0; i < streams.size()-1; i++) {
                System.out.print(Math.round(streams.get(i)) + " ");
            }
			System.out.print(Math.round(streams.get(streams.size()-1)));
            break;
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
