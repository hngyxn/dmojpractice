package demoj.practice;
import java.util.*;
import java.io.*;

//i wanna play totk

public class ccc10s5 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    static int haha = (int) 1e9+7;
    public static void main(String[] args) throws IOException {
        String s = readLine();
        int a = readInt();
        Node root = buildTree(s);
        help(root, a);
        System.out.println(root.dp[a]);
    }

    static void help(Node now, int growth) {
        if (now.l == null || now.r==null) {
            now.dp = new int[growth+1];
            for (int i = 0; i <= growth; i++) {
                now.dp[i] = now.val + i;
            }
            return;
        }

        help(now.l, growth);

        int [] l = new int[growth+1];

        for (int i = 0; i <= growth; i++) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                int temp = Math.min((1+j)*(1+j), now.l.dp[i-j]);
                if (temp>max) max = temp;
            }
            l[i] = max;
        }

        help(now.r, growth);

        int [] r = new int[growth+1];

        for (int i = 0; i <= growth; i++) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                int temp = Math.min((1+j)*(1+j), now.r.dp[i-j]);
                if (temp>max) max = temp;
            }
            r[i] = max;
        }

        now.dp = new int[growth+1];
        
        for (int i = 0; i <= growth; i++) {
            int max = 0;
            for (int j = 0; j <= i; j++) {
                int temp = l[j]+r[i-j]; 
                if (temp>max) max = temp;
            }
            now.dp[i] = max;
        }

    }

    static Node buildTree(String s) {
        s = s.trim();
        if (s.charAt(0)!='(') return new Node(Integer.parseInt(s));
        s = s.substring(1, s.length()-1).trim();
        int idx = -1, l = -1;
        if (s.charAt(0)=='(') {
            l = 1; idx = 1;
            while (l>0) {
                if (s.charAt(idx)=='(') l++;
                else if (s.charAt(idx)==')') l--;
                idx++;
            }
        }
        else {
            idx = s.indexOf(' ');
        }
        return new Node(buildTree(s.substring(0, idx)), buildTree(s.substring(idx+1))); 

    }

    static class Node {
        int [] dp;
        Node l, r;
        int val;
        Node(int v) {
            val = v;
        }
        Node(Node left, Node right) {
            l = left; r = right;
        }
    }

    static int readLongLineInt() throws IOException{
        int x = 0, c;
        while((c = br.read()) != ' ' && c != '\n')
            x = x * 10 + (c - '0');
        return x;
    }

    static long powerUp(long x, long exp) {
        if (exp == 0) return 1;
        long t = powerUp(x, exp / 2);
        t = (t * t) % haha;
        if (exp % 2 == 0) return t;
        return (t * x) % haha;
    }

    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException {
        return Long.parseLong(next());
    }
    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter() throws IOException {
        return next().charAt(0);
    }
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
    

}