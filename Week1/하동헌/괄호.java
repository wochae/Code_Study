import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String input = br.readLine();

            Stack<Character> stack = new Stack<>();
            int f = 0;
            for (int idx = 0; idx < input.length(); idx++) {
                if (input.charAt(idx) == '(') {
                    stack.push(input.charAt(idx));
                } else {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        f = 1;
                        break;
                    }
                }
            }
            if (stack.empty() && f == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        br.close();
    }
}