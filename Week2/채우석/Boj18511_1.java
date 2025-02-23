package Week2.채우석;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 큰 수 구성하기
public class Boj18511_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] allowed = new int[K];
        for (int i = 0; i < K; i++) {
            allowed[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(allowed);

        String result = findMaxNumber(N, allowed);

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.println(sb);
    }

    static String findMaxNumber(String n, int[] allowed) {
        int len = n.length();
        char[] ans = new char[len];
        boolean flag = true;

        for (int i = 0; i < len; i++) {
            int digit = n.charAt(i) - '0';
            if (flag) {
                int candidate = - 1;
                for (int d : allowed) {
                    if (d <= digit) {
                        candidate = d;
                    }
                }
                if (candidate == -1) {
                    int j = i - 1;
                    while (j >= 0) {
                        int currentDigit = ans[j] - '0';
                        int newCandidate = -1;
                        for (int d : allowed) {
                            if (d < currentDigit) {
                                newCandidate = d;
                            }
                        }
                        if (newCandidate != -1) {
                            ans[j] = (char)(newCandidate + '0');
                            for (int k = j + 1; k < len; k++) {
                                ans[k] = (char) (allowed[allowed.length - 1] + '0');
                            }
                            return new String(ans);
                        }
                        j--;
                    }

                    char[] res = new char[len - 1];
                    Arrays.fill(res, (char) (allowed[allowed.length - 1] + '0'));
                    return new String(res);
                } else {
                    ans[i] = (char)(candidate + '0');
                    if (candidate < digit) {
                        flag = false;
                    }
                }
            } else {
                ans[i] = (char) (allowed[allowed.length - 1] + '0');
            }
        }
        return new String(ans);
    }
}
