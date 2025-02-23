import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] isBad = new boolean[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            isBad[x][y] = true;
            isBad[y][x] = true;
        }

        int cnt = 0;
        for (int i = 1; i <= N - 2; i++) {
            for (int j = i + 1; j <= N - 1; j++) {
                for (int k = j + 1; k <= N; k++) {
                    if (isBad[i][j] || isBad[i][k] || isBad[j][k]) {
                        continue;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
