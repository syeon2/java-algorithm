import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] line = new int[100001];
	static int[] dist = new int[100001];
	static boolean[] check = new boolean[100001];

	static int N;
	static int K;
	static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		dist[N] = 0;
		check[N] = true;
		queue.add(N);

		while (!queue.isEmpty()) {
			Integer now = queue.remove();

			if (now - 1 >= 0 && !check[now - 1]) {
				queue.add(now - 1);
				dist[now - 1] = dist[now] + 1;
				check[now - 1] = true;
			}

			if (now + 1 < 100001 && !check[now + 1]) {
				queue.add(now + 1);
				dist[now + 1] = dist[now] + 1;
				check[now + 1] = true;
			}

			if (now * 2 < 100001 && !check[now * 2]) {
				queue.add(now * 2);
				dist[now * 2] = dist[now] + 1;
				check[now * 2] = true;
			}
		}

		bw.write(String.valueOf(dist[K]));
		bw.flush();
		bw.close();
    }

}
