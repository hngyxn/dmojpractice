import java.io.*;
import java.util.*;

@SuppressWarnings("all")


public class template2 { 
	
    public static int node, branches;
    public static LinkedList<Integer> adjList[];
 
    template2 (int v) {
        node = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }
 
    void addEdge(int v,int w) {
        adjList[v].add(w);
    }
 
    void bfs(int s) {
    	branches = 0;
        boolean visited[] = new boolean[node];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.remove();
            Iterator<Integer> i = adjList[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    branches++;
                    System.out.println(branches);
                } 
            }
        }
    }
 
    public static void main(String args[]) throws IOException {
        template2 graph = new template2(4);
        for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 4; j++) {
        		int next = readInt();
        		if (next == 1) {
        			graph.addEdge(j, i);
        		}
        	}
        }
        if (branches != 3) {
        	System.out.println("No");
        } else {
        	System.out.println("Yes");
        }
    }
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String read() {
        while (st == null || !st.hasMoreTokens()) {
            try { st = new StringTokenizer(br.readLine());
            } catch (IOException e) {}
        }
        return st.nextToken();
    }
    static int readInt() {
        return Integer.parseInt(read());
    }
    static long readLong() {
        return Long.parseLong(read());
    }
    static double readDouble() {
        return Double.parseDouble(read());
    }
    static char readChar() throws IOException {
    	return read().charAt(0);
    }
	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}