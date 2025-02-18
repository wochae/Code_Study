package Week1.채우석;

import java.io.*;
import java.util.*;


// 큐 2
public class Boj18258 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(queue.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peekFirst() + "\n");
                    break;
                case "back":
                    bw.write(queue.isEmpty() ? "-1\n" : queue.peekLast() + "\n");
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}