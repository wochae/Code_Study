package Week4.채우석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj11053_2 {
    static int[] seq;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        seq = new int[N];
        dp = new int[N]; // int 배열로 변경
        Arrays.fill(dp, -1); // -1로 초기화

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(input[i]);
        }

        int max = 0; // 최댓값을 저장할 변수
        for (int i = 0; i < N; i++) {
            max = Math.max(max, LIS(i));
        }

        System.out.println(max);
    }

    static int LIS(int N) {
        if (dp[N] != -1) return dp[N]; // 이미 계산된 경우 바로 반환

        dp[N] = 1; // 최소 길이는 1

        for (int i = 0; i < N; i++) { // i < N으로 변경
            if (seq[i] < seq[N]) {
                dp[N] = Math.max(dp[N], LIS(i) + 1);
            }
        }
        return dp[N];
    }
}
