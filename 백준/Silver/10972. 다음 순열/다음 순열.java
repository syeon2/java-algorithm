
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

        int[] nList = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation(nList)) {
            for (int i = 0; i < N; i++) {
                bw.write(String.valueOf(nList[i]));
                bw.write(String.valueOf(" "));
            }
        } else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        bw.close();
    }

    public static boolean nextPermutation(int[] list) {
        int i = list.length - 1;

        while (i > 0) {
            if (list[i] < list[i - 1]) i -= 1;
            else break;
        }

        if (i == 0) return false;

        int k = list.length - 1;

        int changeNum = Integer.MAX_VALUE;
        int changeInx = 0;
        while (i <= k) {
            if (list[i - 1] < list[k]) {
                if (changeNum > list[k]) {
                    changeNum = list[k];
                    changeInx = k;
                }
            }
            k -= 1;
        }

        int temp = list[i - 1];
        list[i - 1] = list[changeInx];
        list[changeInx] = temp;

        int l = list.length - 1;

        while (i < l) {
            int temp2 = list[i];
            list[i] = list[l];
            list[l] = temp2;
            i += 1;
            l -= 1;
        }

        return true;
    }
}