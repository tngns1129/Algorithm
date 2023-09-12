import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int y,m;
        y=0;
        m=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] fee = new int [n];
        for(int i=0; i<n; i++){
            fee[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            y = y + (fee[i]/30 + 1)*10;
            m = m + (fee[i]/60 + 1)*15;
        }
        if(y > m){
            System.out.println("M " + m);
        } else if(y < m){
            System.out.println("Y " + y);
        } else{
            System.out.println("Y M " + y);
        }
    }
}