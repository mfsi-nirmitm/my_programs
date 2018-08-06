import java.util.*;
import java.lang.*;
import java.io.*;

// http://codeforces.com/problemset/problem/217/A
public class A_217
{
	public static void dfs(int[] x,int[] y,boolean[] v,int index,int n) {
		if(v[index]) return;
		v[index] = true;
		for(int i=0;i<n;i++) {
			if(x[index] == x[i] || y[index] == y[i]) {
				dfs(x,y,v,i,n);
			}
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter output = new PrintWriter(System.out);
		StringTokenizer token = null;
		
		int n = Integer.parseInt(input.readLine());
		
		int x[] = new int[n];
		int y[] = new int[n];
		boolean visited[] = new boolean[n];
		
		for(int i=0;i<n;i++) {
			token = new StringTokenizer(input.readLine());
			x[i] = Integer.parseInt(token.nextToken());
			y[i] = Integer.parseInt(token.nextToken());
		}
		int ans =0;
		for(int i=0;i<n;i++) {
			if(!visited[i]) ans++;
			dfs(x,y,visited,i,n);
		}
		
		output.print(ans-1);
		
		output.close();
	}
}
