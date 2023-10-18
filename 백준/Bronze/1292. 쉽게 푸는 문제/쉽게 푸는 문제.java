import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start,end;
        int i=1;
        int num=0;
        int ans=0;
        boolean bool = true;
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        while(bool){
            for(int j=1; j<=i; j++){
                num++;
                if(num>=start && num<=end){
                    ans+=i;
                    if(num==end){
                        bool = false;
                    }
                }
            }
            i++;
        }
        System.out.println(ans);
        
    }
}