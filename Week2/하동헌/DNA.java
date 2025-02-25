import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int cntA = 0, cntC = 0, cntG = 0, cntT = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j].charAt(i) == 'A') {
                    cntA++;
                } else if (arr[j].charAt(i) == 'C') {
                    cntC++;
                } else if (arr[j].charAt(i) == 'G') {
                    cntG++;
                } else if (arr[j].charAt(i) == 'T') {
                    cntT++;
                }
            }

            int cntMax = Math.max(cntA, Math.max(cntC, Math.max(cntG, cntT)));
            if (cntMax == cntA) {
                sb.append("A");
            } else if (cntMax == cntC) {
                sb.append("C");
            } else if (cntMax == cntG) {
                sb.append("G");
            } else if (cntMax == cntT) {
                sb.append("T");
            }
            ans += (N - cntMax);
        }

        System.out.println(sb);
        System.out.println(ans);

        br.close();
    }
}
