package Week2.채우석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj15721_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 진행할 라운드
        int T = Integer.parseInt(br.readLine()); // T가 B번째 나오는 인덱스 찾기
        int B = Integer.parseInt(br.readLine()); // 찾을 값 (0: 번, 1: 데기)

        int round = 1;

        List<Integer> order = new ArrayList<>();
        order.add(0);
        order.add(1);
        order.add(0);
        order.add(1);

        while (round <= N) {
            // (round + 1) 만큼 0 추가
            for (int i = 0; i < round + 1; i++) {
                order.add(0);
            }
            // (round + 1) 만큼 1 추가
            for (int i = 0; i < round + 1; i++) {
                order.add(1);
            }
            round++;
        }

        // 목표 값 찾기
        int result = findNthOccur(order, T, B);
        System.out.println(result);
    }

    public static int findNthOccur(List<Integer> arr, int target, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }
}