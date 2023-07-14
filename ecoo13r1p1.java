import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ecoo13r1p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int nextToServe = n;
        String s = br.readLine().trim();
        int late = 0;
        int served = 0;
        while(!s.equals("EOF")){
            if(s.equals("TAKE")){
                late++;
                n++;
                if(n == 1000){
                    n = 1;
                }
            }else if(s.equals("SERVE")){
                served++;
                nextToServe++;
                if(nextToServe == 1000){
                    nextToServe = 1;
                }

            }else if(s.equals("CLOSE")){
                System.out.println(late+" "+(late-served)+" "+n);
                late = 0;
                served = 0;
                nextToServe = n;
            }
            s = br.readLine().trim();
        }


    }
}