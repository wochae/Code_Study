package Week1.채우석;

// 괄호

import java.io.*;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String S = br.readLine();

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == '(') {
                    stack.push(S.charAt(j));
                } else {
                    if (stack.empty()) {
                        stack.push(S.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty())
                System.out.println("YES");
            else
                System.out.println("NO"); // 괄호 개수 안 맞아도 NO 를 내도록, 출력이 아니라 반환형으로 바꾸기
        }
    }
}
