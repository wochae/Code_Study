package Week2.채우석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Boj15721_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 진행할 라운드
        int T = Integer.parseInt(br.readLine()); // T가 B번째 나오는 인덱스 찾기
        int B = Integer.parseInt(br.readLine()); // 찾을 값 (0: 번, 1: 데기)

        int count = 0;
        int person = 0;
        int round = 1;

        while(true) {
            if (B == 0) {
                count++; if (count == T) break;
            }
            person = (person + 1) % N;
            if (B == 1) {
                count++; if (count == T) break;
            }
            person = (person + 1) % N;
            if (B == 0) {
                count++; if (count == T) break;
            }
            person = (person + 1) % N;
            if (B == 1) {
                count++;
                if (count == T) break;
            }
            person = (person + 1) % N;

            // 2. 추가적인 "뻔 * round, 데기 * round"
            for (int i = 0; i < round + 1; i++) {
                if (B == 0) {
                    count++; if (count == T) break;
                }
                person = (person + 1) % N;
            }
            if (count == T) break;
            for (int i = 0; i < round + 1; i++) {
                if (B == 1) {
                    count++; if (count == T) break;
                }
                person = (person + 1) % N;
            }
            if (count == T) break;

            round++;
        }
        System.out.println(person);
    }

}