import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int i = 1;
        int index = 0;
        boolean l = true;
        while(l){
            if(x-i > 0){
                x = x - i;
                i++;
            } else{
                l = false;
            }
        }
        if(i%2 == 0){
            System.out.println(x + "/" + ((i+1)-x));
        } else{
            System.out.println((i+1)-x + "/" + x);
        }
    }
}