import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int cumulative = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            cumulative += arr[i];
            sum += cumulative;
        }

        System.out.println(sum);

        br.close();
    }
}

/*
1 2 3 3 4
1 + 3 + 6 + 9 + 13 = 32
*/
