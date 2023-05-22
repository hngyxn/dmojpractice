package demoj.practice;
import java.util.*;
@SuppressWarnings("resource")

public class Binoculars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] houses = new long[n];
        long[] startHouses = new long[n];
        int A;
        int B;
        long people;
        
        for(int i = 0; i < k; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            people = sc.nextLong();

            houses[B-1] += people;
            if(houses[A-1] - people < 0) {
                startHouses[A-1] += Math.abs(houses[A - 1] - people);
                houses[A-1] = 0;
            }else{
                houses[A-1] -= people;
            }
        }

        long sum = 0;

        for(int i = 0; i < n; i++) {
            sum += startHouses[i];
        }

        System.out.println(sum);
        System.out.print(startHouses[0]);

        for(int i = 1; i < n; i++){
            System.out.print(" "+startHouses[i]);
        }
    }
}