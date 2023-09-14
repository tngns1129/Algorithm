import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int answer = 0;
        String binaryString = Integer.toBinaryString(x);
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                answer++;
            }
        }
        System.out.println(answer);
    }
}