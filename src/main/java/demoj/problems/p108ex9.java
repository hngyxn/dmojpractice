package demoj.problems;
import java.util.*;
import java.io.*;
public class p108ex9 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int a = readInt();
        for (int i = 0; i < a; i++) {
            double wage = readDouble();
            int hours = readInt();
            String tbracket = readLine();
            String charity = readLine();
            int donation=10;
            double t =0;
            double taxes =0;

            if(hours<=40) t =   wage*hours;
            else t = (wage *(hours-(hours-40)))+(((hours-40)*wage)*2);

            if(tbracket.equals("B")) taxes = t*0.1;
            else if(tbracket.equals("C")) taxes = t*0.2;
            else if(tbracket.equals("D")) taxes = t*0.29;
            else if(tbracket.equals("E")) taxes = t*0.35;

            if(charity.equals("n")){
                 donation = 0;
            }

            double total = t-taxes-donation;
           double totalpay = Math.round(total*100.0)/100.0;
            System.out.println(String.format("%.2f",totalpay));
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