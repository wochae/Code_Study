import java.io.*;
import java.util.*;

// A에서 B를 만들지 않고 B에서 A를 만든다는 발상의 전환
public class Main {
    private static int A;
    private static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        System.out.println(getCnt());

        br.close();
    }

    private static int getCnt() {
        int cnt = 1;
        while (B > 0) {
            if (B % 2 == 0) {
                B /= 2;
            } else if (B % 10 == 1) {
                B /= 10;
            } else {
                return -1;
            }
            cnt++;

            if (B == A) {
                return cnt;
            }
        }
        return -1;
    }
}
