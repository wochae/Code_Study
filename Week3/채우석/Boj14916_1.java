package Week3.채우석;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static java.util.Collections.min;

public class Boj14916_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rest = Integer.parseInt(br.readLine());
        int[] dp = new int[rest + 1];
        int count = 0;
        for (int i = 0; i < rest; i++) {
            if (i >= 5) {
//                dp[i] = min(dp[i], dp[i - 5] + 1);
            }
            
        }
        System.out.println(count);
    }
}
