package demoj.practice;
import java.util.Scanner;
@SuppressWarnings("resource")

public class nccc1j4s2 {
    public static void main(String[] args)  {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt(), g[][] = new int[n][n];

    	for (int i = 0; i < n; i++){
    		String s = sc.next();

    		for (int j = 0; j < n; j++){
    			char c = s.charAt(j);
    			if (c >='0' && c <= '9') g[i][j] = c-'0';
    			else g[i][j] = c-'A'+10;
    		}
    	}

    	for (int i = 0; i < n; i++){
    		for (int j = 0; j < n; j++){
    			boolean unique = true;

    			for (int k = 0; k < n; k++)
    				if ((k!=j && g[i][k] == g[i][j]) || (k != i && g[k][j] == g[i][j])) unique = false;
    			if(!unique) {
					System.out.println("No"); return; 
				}
    		}
    	}

    	boolean reduced = true;

    	for (int j = 1; j < n; j++) {
    		if (g[0][j] <= g[0][j-1] || g[j][0] <= g[j-1][0]) reduced = false;
		}

    	if (reduced) System.out.println("Reduced");
    	else System.out.println("Latin");
    }
}