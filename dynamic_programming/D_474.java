import java.util.*;
import java.lang.*;
import java.io.*;
 
// http://codeforces.com/contest/474/problem/D
public class D_474
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter output = new PrintWriter(System.out);
		StringTokenizer token = new StringTokenizer(input.readLine());
 
		long dp[] = new long[100001];
		long mod =  1000000007l;
		int length = dp.length;
		int t = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
 
		for(int i=0;i<k;i++) dp[i] =1l;
		for(int i=k;i<length;i++) dp[i] = (dp[i-1]+dp[i-k]) % mod;
		for(int i=1;i<length;i++) dp[i] = (dp[i]+dp[i-1]) %mod;
 
		while(t-->0) {
		    token = new StringTokenizer(input.readLine());
		    int l = Integer.parseInt(token.nextToken());
		    int r = Integer.parseInt(token.nextToken());
		    output.println((dp[r]-dp[l-1])%mod);
		}
 
		output.close();
	}
}
