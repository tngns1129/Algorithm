import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] a = new String [n];
        for (int i = 0; i < n; i ++){
            a[i] = br.readLine();
        }
        String ans = a[0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length(); j ++){
                if(ans.charAt(j) != a[i].charAt(j)){
                    ans = ans.substring(0, j) + "?" + ans.substring(j+1);
                }
            }
        }
        System.out.println(ans);
    }
}