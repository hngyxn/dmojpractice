import java.util.Scanner;
@SuppressWarnings("resource")

public class ccc18s2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), a[][] = new int[n][n];
        
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++) {
				a[i][j] = sc.nextInt();
            }
        }
		int min = Math.min(Math.min(a[0][0], a[0][n-1]), Math.min(a[n-1][0], a[n-1][n-1]));

		if (min == a[0][n-1]) {
			a = rotate(a);
		} else if (min == a[n-1][n-1]) {
			a = rotate(a); a = rotate(a);
		} else if (min == a[n-1][0]) {
			a = rotate(a); a = rotate(a); a = rotate(a);
		}

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] rotate(int a[][]){
		int n = a.length, b[][] = new int[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = a[j][n-1-i];
            }
        }
        
		return b;
	}
}