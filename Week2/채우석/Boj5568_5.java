package Week2.채우석;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
// 카드 놓기
public class Boj5568_5 {
    static int N, K;
    static String[] arr;
    static boolean[] visited;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); // tokenizer st.nextToken() 를 사용하지 않아도 된다!
        K = Integer.parseInt(br.readLine());
        arr = new String[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        generatePermutations("", 0);

        System.out.println(set.size());
    }

    private static void generatePermutations(String current, int depth) {
        if (depth == K) {
            set.add(current);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                generatePermutations(current + arr[i], depth + 1);
                visited[i] = false;
            }
        }
    }
}

// 생각해보니까 숫자형으로 바꿀 필요가 없었다. 어차피 문자열도 중복된 값은 제거가 되니까.
