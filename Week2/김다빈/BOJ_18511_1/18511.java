import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static String answer = "";
    private static ArrayList<Integer> nums = new ArrayList<>();
    private static String targetNum;

    private static void backtracking(String curNum) {
        if (!curNum.isEmpty() && Long.parseLong(curNum) > Long.parseLong(targetNum)) {
            return;
        }

        if (!curNum.isEmpty()) {
            if (answer.isEmpty() || Long.parseLong(curNum) > Long.parseLong(answer)) {
                answer = curNum;
            }
        }

        for (int num : nums) {
            backtracking(curNum + num);
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        targetNum = String.valueOf(n);
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k; i++ ) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        backtracking("");
        System.out.println(answer);

    }
}