
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// http://codeforces.com/problemset/problem/431/C
public class C_431 { 
    static int mod = 1000000007;;
    public static void main(String arags[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer(input.readLine());

        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());
        int d = Integer.parseInt(token.nextToken());
        
        
        
        output.print( ( fun(n,k)-fun(n,d-1) + mod) % mod );
        
        output.close();
    }
    
    public static int fun(int n , int k) {
        int dp[] = new int[n+1];
        dp[0] = 1;        
        
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=k && i-j>=0;j++) {
                dp[i] = ( dp[i] + dp[i-j]) % mod;
            }
        }
        
        return dp[n];
    }
}

