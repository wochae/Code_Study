package Week2.채우석;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// DNA
public class Boj1969_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] count = new int[4][K];
        String[] dna = new String[N];

        for (int i = 0; i < N; i++) {
            dna[i] = br.readLine();
            for (int j = 0; j < K; j++) {
                char c = dna[i].charAt(j);
                if (c == 'A') count[0][j]++;
                else if (c == 'C') count[1][j]++;
                else if (c == 'G') count[2][j]++;
                else if (c == 'T') count[3][j]++;
            }
        }
        StringBuilder resultData = new StringBuilder();
        int hamSum = 0;

        for (int j = 0; j < K; j++) {
            int maxCount = 0;
            char bestChar = 'A';

            char[] bases = {'A', 'C', 'G', 'T'};
            for (int i = 0; i < 4; i++) {
                if (count[i][j] > maxCount) {
                    maxCount = count[i][j];
                    bestChar = bases[i];
                }
            }
            resultData.append(bestChar);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                if (dna[i].charAt(j) != resultData.charAt(j)) {
                    hamSum++;
                }
            }
        }
        System.out.println(resultData.toString());
        System.out.println(hamSum);
    }
}
