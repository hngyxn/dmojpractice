import java.util.*;
import java.io.*;
public class p175ex5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();

	    for (int z = 0; z < a; z++) {
		    int b = readInt();
		    int arr[][] = new int[b][b];
            
		    for (int i = 0; i < b; i++) {
			    for(int j = 0; j < b; j++) {
				    arr[i][j] = readInt();
				    arr[i][b - 1] += arr[i][j];
				    arr[b - 1][j] += arr[i][j];
			    }
		    }

		    int sum = arr[0][b - 1];
	        boolean magic = true;

	        for (int i = 0; i < b; i++) {
		        if (sum != arr[i][b - 1] || sum != arr[b - 1][i]) {
			    magic = false;
			    break;
            }
	    }

	    if(magic) System.out.println("yes");
	    else System.out.println("no");
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
