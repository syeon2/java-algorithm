import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static char[] gahter = {'a', 'e', 'i', 'o', 'u'};
    static char[] list;
    static int[] pos;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        list = new char[C];
        pos = new int[C];
        check = new boolean[C];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < C; i++) {
            list[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(list);

        getList(0, L, C, 0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void getList(int idx, int l, int c, int init) {
        if (idx == l) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < l; k++) {
                    if (gahter[i] == list[pos[k]]) count++;
                }
            }

            if (!(count > 0 && count <= l - 2)) return;

            for (int i = 0; i < l; i++) {
                sb.append(list[pos[i]]);
            }
            sb.append("\n");
            return;
        }

        for (int i = init; i < c; i++) {
            if (check[i]) continue;

            check[i] = true;
            pos[idx] = i;
            getList(idx + 1, l, c, i + 1);
            check[i] = false;
        }
    }
}