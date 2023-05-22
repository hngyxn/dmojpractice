package demoj.practice;
import java.util.*;
import java.io.*;
public class p109ex10 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();
        int b = a;
        int q = 0;
        int d = 0;
        int n = 0;
        int p = 0;
        
        if (b >= 25) {
            q = Math.round(b/25);
            b -= q*25;
        } 
        
        if (b >= 10) {
            d = Math.round(b/10);
            b -= d*10;
        } 
            
        if (b >= 5) {
            n = Math.round(b/5);
            b -= n*5;
        }

        p = b;    

        

        if (a == 1) {
            System.out.println("1 cent requires 1 cent.");
        } else {
            System.out.print(a + " cents requires ");
            if (q > 0) {
                if (q > 1) System.out.print(q + " quarters");
                else System.out.print(q + " quarter");
                if (d != 0 || n != 0 || p != 0) System.out.print(", ");
                else System.out.print(".");
            }
    
            if (d > 0) {
                if (d > 1) System.out.print(d + " dimes");
                else System.out.print(d + " dime");
                if (n != 0 || p != 0) System.out.print(", ");
                else System.out.print(".");
            }
    
            if (n > 0) {
                if (n > 1) System.out.print(n + "nickels");
                else System.out.print(n + " nickel");
                if (p != 0) System.out.print(", ");
                else System.out.print(".");
            }
    
            if (p > 0) {
                if (p > 1) System.out.print(p + " cents.");
                else System.out.print(p + " cent.");
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
