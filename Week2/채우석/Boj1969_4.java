package Week2.채우석;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// DNA
public class Boj1969_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // static Map 을 가지고, 해당하는 위치를 반환해서 그 값에 1을 추가해주나?
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'A');
        map.put(2, 'T');
        map.put(3, 'G');
        map.put(4, 'C');
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                // counting Char each position in string
            }
        }
    }
}
