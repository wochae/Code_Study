import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        HashSet<String> set = new HashSet<>();
        if (k == 2) {
            for (int idx1 = 0; idx1 < n; idx1++) {
                for (int idx2 = 0; idx2 < n; idx2++) {
                    if (idx1 == idx2) {
                        continue;
                    }

                    StringBuilder sb = new StringBuilder();
                    set.add(String.valueOf(sb.append(arr[idx1]).append(arr[idx2])));
                }
            }
        }
        else if (k == 3) {
            for (int idx1 = 0; idx1 < n; idx1++) {
                for (int idx2 = 0; idx2 < n; idx2++) {
                    if (idx1 == idx2) {
                        continue;
                    }
                    for (int idx3 = 0; idx3 < n; idx3++) {
                        if (idx1 == idx3 || idx2 == idx3) {
                            continue;
                        }
                        StringBuilder sb = new StringBuilder();
                        set.add(String.valueOf(sb.append(arr[idx1]).append(arr[idx2]).append(arr[idx3])));
                    }
                }
            }
        }
        else if (k == 4) {
            for (int idx1 = 0; idx1 < n; idx1++) {
                for (int idx2 = 0; idx2 < n; idx2++) {
                    if (idx1 == idx2) {
                        continue;
                    }
                    for (int idx3 = 0; idx3 < n; idx3++) {
                        if (idx1 == idx3 || idx2 == idx3) {
                            continue;
                        }
                        for (int idx4 = 0; idx4 < n; idx4++) {
                            if (idx1 == idx4 || idx2 == idx4 || idx3 == idx4) {
                                continue;
                            }
                            StringBuilder sb = new StringBuilder();
                            set.add(String.valueOf(sb.append(arr[idx1]).append(arr[idx2]).append(arr[idx3]).append(arr[idx4])));
                        }
                    }
                }
            }
        }
        System.out.println(set.size());

        br.close();
    }
}
