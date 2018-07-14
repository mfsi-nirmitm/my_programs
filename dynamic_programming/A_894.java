import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// problem - http://codeforces.com/contest/894/problem/A
public class A_894 {
    public static void main(String arags[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        //StringTokenizer token = new StringTokenizer(input.readLine());

        String str = input.readLine();
        int length = str.length();
        
        int dp1[] = new int[length];
        int dp2[] = new int[length];
        
        if(str.charAt(0)=='Q') dp1[0] = 1;
        for(int i=1;i<length;i++) {
            if(str.charAt(i)=='Q') dp1[i] =1;
            dp1[i]+=dp1[i-1];
        }
        
        if(str.charAt(length-1)=='Q') dp2[length-1]=1;
        for(int i=length-2;i>=0;i--) {
            if(str.charAt(i)=='Q') dp2[i] =1;
            dp2[i]+=dp2[i+1];
        }

        int res=0;
        for(int i=1;i<length-1;i++) {
            if(str.charAt(i)=='A') {
                res+= (dp1[i-1]*dp2[i+1]);
            }
        }
        
        output.print(res);
        
        output.close();
    }
}