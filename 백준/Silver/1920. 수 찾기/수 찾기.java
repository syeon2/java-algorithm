import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nList = new int[N];
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nList);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int m = 0; m < M; m++) {
            int num = Integer.parseInt(st.nextToken());

            if (biSearch(nList, num)) sb.append(1);
            else sb.append(0);

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static boolean biSearch(int[] list, int num) {
        int start = 0;
        int end = list.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (list[mid] == num) return true;

            if (list[mid] < num) start = mid + 1;
            else end = mid - 1;
        }

        return false;
    }
}