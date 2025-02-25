import java.io.*;
import java.util.*;

public class Main {
    private static int A;
    private static int T;
    private static int BD;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        BD = Integer.parseInt(br.readLine());

        printNum();

        br.close();
    }

    private static void printNum() {
        int bCnt = 0, dCnt = 0;
        int turn = 2;

        // 번데기 게임 시작!
        while (true) {
            // 뻔 + 데기 + 뻔 + 데기
            for (int i = 0; i < 4; i++) {
                if (i == 0 || i == 2) {
                    bCnt++;

                    if (BD == 0 && bCnt == T) {
                        System.out.println((bCnt + dCnt - 1) % A);
                        return;
                    }
                }
                else if (i == 1 || i == 3) {
                    dCnt++;

                    if (BD == 1 && dCnt == T) {
                        System.out.println((bCnt + dCnt - 1) % A);
                        return;
                    }
                }
            }

            // 뻔 x turn
            for (int i = 0; i < turn; i++) {
                bCnt++;

                if (BD == 0 && bCnt == T) {
                    System.out.println((bCnt + dCnt - 1) % A);
                    return;
                }
            }

            // 데기 x turn
            for (int i = 0; i < turn; i++) {
                dCnt++;

                if (BD == 1 && dCnt == T) {
                    System.out.println((bCnt + dCnt - 1) % A);
                    return;
                }
            }

            turn++;
        }
    }
}
