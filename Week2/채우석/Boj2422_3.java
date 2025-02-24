package Week2.채우석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 한 이 가 아 사
public class Boj2422_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            List<Integer> list = map.get(idx);
            list.add(Integer.parseInt(st.nextToken()));
            map.put(idx, list);
        }
        System.out.println(map); // 맵은 프린트로 출력이 되는구나?

        for (int i = 1; i <= N; i++) {
            int count = generateCombination(i, map.get(i), K);
        }
    }

    private static int generateCombination(int i, List<Integer> integers, int k) {

        return 0;
    }

}
