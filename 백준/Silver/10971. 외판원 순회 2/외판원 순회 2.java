import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] permutation = new int[N];
        int[][] list = new int[N][N];

        for (int i = 0; i < N; i++) {

            permutation[i] = i;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < N; k++) {
                list[i][k] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = Integer.MAX_VALUE;

        do {
            boolean ok = true;
            int temp = 0;
            for (int i = 0; i < N - 1; i++) {
                int dis = list[permutation[i]][permutation[i + 1]];

                if (dis == 0) ok = false;
                else temp += dis;
            }

            if (ok && list[permutation[N - 1]][permutation[0]] != 0) {
                temp += list[permutation[N - 1]][permutation[0]];
                answer = Math.min(answer, temp);
            }
        } while (nextPermutation(permutation));

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static boolean nextPermutation(int[] list) {
        int i = list.length - 1;

        while (i > 0) {
            if (list[i - 1] > list[i]) i -= 1;
            else break;
        }

        if (i == 0) return false;

        int k = list.length - 1;

        int changeNum = 11;
        int changeIdx = 0;

        while (i <= k) {
            if (list[i - 1] < list[k]) {
                if (changeNum > list[k]) {
                    changeNum = list[k];
                    changeIdx = k;
                }
            }

            k -= 1;
        }

        int temp = list[i - 1];
        list[i - 1] = list[changeIdx];
        list[changeIdx] = temp;

        int l = list.length - 1;

        while (i < l) {
            int temp2 = list[i];
            list[i] = list[l];
            list[l] = temp2;
            l -= 1;
            i += 1;
        }

        return true;
    }
}