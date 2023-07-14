import java.io.*;
import java.util.*;

public class dmopc14c2p3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());

		ArrayList<Integer> e = new ArrayList<Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();

		st = new StringTokenizer(in.readLine());
		for(int i = 0; i<n; i++) {
			e.add(Integer.parseInt(st.nextToken()));
		}
        
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i<n; i++) {
			l.add(Integer.parseInt(st.nextToken()));
		}
	}
}


