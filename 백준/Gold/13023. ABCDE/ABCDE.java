import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] isVisit = new boolean[N][N];
        List<Integer>[] iList = (List<Integer>[]) new ArrayList[N];
        List<Edge2> gList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            iList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            iList[A].add(B);
            iList[B].add(A);

            isVisit[A][B] = true;
            isVisit[B][A] = true;

            gList.add(new Edge2(A, B));
            gList.add(new Edge2(B, A));
        }

        M *= 2;

        for (int i = 0; i < M; i++) {

            for (int k = 0; k < M; k++) {
                int A = gList.get(i).from;
                int B = gList.get(i).to;
                int C = gList.get(k).from;
                int D = gList.get(k).to;

                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }

                if (!isVisit[B][C]) continue;

                for (int E : iList[D]) {
                    if (A == E || B == E || C == E || D == E) {
                        continue;
                    }

                    bw.write(String.valueOf(1));
                    bw.flush();
                    bw.close();
                    return;
                }
            }
        }

        bw.write(String.valueOf(0));
        bw.flush();
        bw.close();
    }
}

class Edge2 {
    int from;
    int to;

    public Edge2(int from, int to) {
        this.from = from;
        this.to = to;
    }
}