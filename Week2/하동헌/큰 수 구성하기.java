import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int KSize = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < KSize; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // N부터 1까지 내림차순 탐색
        for (int cur = N; cur >= 1; cur--) {
            String curStr = String.valueOf(cur);

            // cur의 각 자리 숫자가 모두 K 집합에 포함된다면 ans
            boolean isValid = true;
            for (int i = 0; i < curStr.length(); i++) {
                if (!set.contains(curStr.charAt(i) - '0')) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(cur);
                break;
            }
        }

        br.close();
    }
}
