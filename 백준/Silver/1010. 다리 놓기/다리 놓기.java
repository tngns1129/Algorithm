import java.io.*;
import java.util.*;

public class Main {
    
    private static final int[][] dp = new int[31][31];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int west = Integer.parseInt(st.nextToken());
            int east = Integer.parseInt(st.nextToken());
            System.out.println(combination(east, west));
        }
    }
    private static int combination(int n, int r)
    {
        // 이미 계산된 값일 경우
        if (dp[n][r] > 0)
        {
            return dp[n][r];
        }
        
        // 원소의 갯수가 조합의 갯수와 동일하거나 0일 경우
        else if (n == r || r == 0)
        {
            return dp[n][r] = 1;
        }
        
        // 일반적인 경우
        else
        {
            return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }
}