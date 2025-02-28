import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (n > 0) {
            if (n < 2) {
                cnt = -1;
                break;
            }

            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            }

            n -= 2;
            cnt++;
        }
        System.out.println(cnt);

        br.close();
    }
}
