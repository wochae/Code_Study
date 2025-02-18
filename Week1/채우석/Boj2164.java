package Week1.채우석;


import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

// 카드 2
public class Boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            int x = queue.poll();
            if (queue.isEmpty()) {
                bw.write(x + "\n");
            } else {
                queue.add(queue.poll());
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }
}
