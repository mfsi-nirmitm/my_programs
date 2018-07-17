
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// http://codeforces.com/problemset/problem/672/B
public class B_672 { 
    public static void main(String arags[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        StringTokenizer token = new StringTokenizer(input.readLine());

        int n = Integer.parseInt(token.nextToken());
        String str = input.readLine();
        
        boolean letters[] = new boolean[26];
        int count=0;
        for(int i=0;i<n;i++) {
            char ch = str.charAt(i);
            if(letters[ch-'a']) count++;
            else letters[ch-'a'] = true;
        }
        int not_count = 0;
        for(int i=0;i<26;i++) if(!letters[i]) not_count++;
        
        if(count> not_count) output.print(-1);
        else output.print(count);

        output.close();
    }
}

