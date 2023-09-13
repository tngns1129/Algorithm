import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a,b,newNumber = -1;
        int cycle = 0;
        a = n/10;
        b = n%10;
        while(n != newNumber){
            newNumber = b*10 + (a+b)%10;
            a = newNumber/10;
            b = newNumber%10;
            cycle++;
        }
        System.out.println(cycle);
    }
}