import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] n = new int[5];
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < 5; i++){
            n[i]= Integer.parseInt(st.nextToken());
        }
        while(temp < 3){
            answer++;
            temp = 0;
            for(int i = 0; i < 5; i++){
                if(answer%n[i] == 0){
                    temp++;
                }
            }
        }
        System.out.println(answer);
    }
}