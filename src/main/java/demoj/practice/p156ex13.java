package demoj.practice;
import java.util.*;
import java.io.*;
public class p156ex13 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int a = readInt();
        int count = 2; 
        int countprime = 0;
        int count10 = 0;
        boolean first = false;

        while (countprime < a) {
            if (count10 == 10) {
                System.out.println();
                count10 = 0;
                first = false;
            }
            if (isPrime(count)) {
                if (!first) {
                    System.out.print(count);
                    count10++;
                    countprime++;
                    first = true;
                } else {
                    System.out.print(" " + count);
                    count10++;
                    countprime++;
                }
                
            }
            count++;
        }
	}

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        

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
