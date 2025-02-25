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

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, new HashSet<>());
        }
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map.get(a).add(b);
            map.get(b).add(a);
        }

        int valCount = countValidCombinations(N, map);
        System.out.println(valCount);

    }

    private static int countValidCombinations(int N, Map<Integer, Set<Integer>> map) {
        int count = 0;

        for (int i = 1; i <= N - 2; i++) {
            for (int j = i + 1; j <= N - 1; j++) {
                if (map.get(i).contains(j)) continue;
                for (int k = j + 1; k <= N; k++) {
                    if (map.get(i).contains(k) || map.get(j).contains(k)) continue;

                    count++;
                }
            }
        }
        return count;
    }

    // 원래 아이디어는 리스트로 구성된 맵을 생성해서 숫자에 해당하는 키를 이용해서 리스트 요소가 포함되는 조합들을 제거하려고 했다.
    // 그 제거하는 방법은 먼저 조합들을 생성하기 전에 if 조건절에서 걸리게 된다면 유효하지 않기 때문에 넘어가는 방식으로 구상했다.

    // 지금 전개된 풀이에서는 리스트 대신 셋을 사용하며 검색 속도가 향상 되도록 하였다.
    // 리스트의 Contains 는 최악의 경우 모든 길이를 탐색하는 O(n)가 나올 수 있다.
    // 하지만 set 는 내부적으로 해시 테이블을 사용해서 접근하기 때문에 O(1)이다.



}