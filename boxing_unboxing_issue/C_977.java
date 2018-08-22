import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


// problem - http://codeforces.com/contest/977/problem/C
public class Main {
     public static void main(String args[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer(input.readLine());

        int n = Integer.parseInt(token.nextToken());
        int k = Integer.parseInt(token.nextToken());
        
        token = new StringTokenizer(input.readLine());
        
        Integer arr[] = new Integer[n]; // boxing unboxing issue in java
        
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        
        Arrays.sort(arr);
        
        int ans = -1;
	if (k == 0) {
            if (arr[0] > 1)
                ans = 1;
        } 
        else if (k == n) {
            ans = 1000000000;
        } 
        else {
            if (arr[k] > arr[k - 1])
                ans = arr[k - 1];
        }
        output.println(ans);       
        
        output.close();
    }
}
