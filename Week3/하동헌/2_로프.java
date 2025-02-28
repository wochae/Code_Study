import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        
        int max = 0;
        for (int k = 0; k < N; k++) {
            max = Math.max(max, arr[k] * (N - k));
        }
        
        System.out.println(max);

        br.close();
    }
}

/*
100
200

200


10
100
200

200


1
2
3
10

10
*/
