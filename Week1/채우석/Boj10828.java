package Week1.채우석;


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택
public class Boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(stack.isEmpty() ? "-1\n" : stack.pop() + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case "top":
                    bw.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
