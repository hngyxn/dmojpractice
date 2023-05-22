package demoj.practice;
import java.util.*;

import java.io.*;
public class p124ex3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		double money = readDouble();

        double interest = readDouble();
        interest /= 100;
        int year = readInt();
        System.out.print(0 + " ");
        System.out.printf("%.2f", money);
        System.out.println();

        for (int i = 1; i <= year; i++) {
            System.out.print(i + " ");
            money += (interest*money);
            System.out.printf("%.2f", money);
            System.out.println();
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
