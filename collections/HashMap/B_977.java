
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

// http://codeforces.com/problemset/problem/977/B
public class B_977 {
    public static void main(String arags[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(System.out);
        //StringTokenizer token = new StringTokenizer(input.readLine());

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        int length = Integer.parseInt(input.readLine());
        String str = input.readLine();
        
        int max_count =0;
        String ans = "";
        for(int i=0;i<length-1;i++) {
            String temp = str.substring(i, i+2);
            //System.out.println(temp);
            if(map.containsKey(temp)) {
                int count = map.get(temp);
                count++;
                if(count>max_count) {
                    max_count = count;
                    ans=temp;
                }
                map.put(temp, count);
            }
            else {
                map.put(temp, 1);
                if(max_count == 0) {
                    max_count=1;
                    ans= temp;
                }
            }
        }
        
        output.print(ans);
        output.close();
    }
}
