
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// problem - http://codeforces.com/problemset/problem/535/B
public class B_535 {
    public static void main(String arags[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        //StringTokenizer token = new StringTokenizer(input.readLine());

        int n = Integer.parseInt(input.readLine());
        int count = 2;
        int ans =0;
        while(n!=0) {
            if(n%10 == 7) {
                ans+=count;
            }
            else ans+=(count/2);
            
            count*=2;
            n/=10;
        }
        output.print(ans);
        
        output.close();
    }
}
