import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] aList = new Integer[N];
        Integer[] bList = new Integer[N];

        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            aList[i] = Integer.parseInt(temp[i]);
        }

        temp = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            bList[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(aList);
        Arrays.sort(bList, Collections.reverseOrder());

        int ans = 0;

        for (int i = 0; i < N; i++) {
            ans += (aList[i] * bList[i]);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}