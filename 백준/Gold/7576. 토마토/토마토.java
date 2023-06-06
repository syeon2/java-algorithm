import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[][] box = new int[N][M];
		int[][] dist = new int[N][M];
		boolean[][] isVisit = new boolean[N][M];
		Queue<Node> queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			for (int k = 0; k < M; k++) {
				int tomato = Integer.parseInt(st.nextToken());
				box[i][k] = tomato;

				if (tomato != -1) dist[i][k] = Integer.MAX_VALUE;
				if (tomato == 1) {
					queue.add(new Node(k, i));
					dist[i][k] = 1;
					isVisit[i][k] = true;
				}
			}
		}

		while (!queue.isEmpty()) {
			Node node = queue.remove();
			int x = node.x;
			int y = node.y;

			if (x < M - 1 && !isVisit[y][x + 1] && box[y][x + 1] != -1) {
				if (dist[y][x + 1] > dist[y][x] + 1) {
					queue.add(new Node(x + 1, y));
					dist[y][x + 1] = dist[y][x] + 1;
					isVisit[y][x + 1] = true;
				}
			}

			if (x > 0 && !isVisit[y][x - 1] && box[y][x - 1] != -1) {
				if (dist[y][x - 1] > dist[y][x] + 1) {
					queue.add(new Node(x - 1, y));
					dist[y][x - 1] = dist[y][x] + 1;
					isVisit[y][x - 1] = true;
				}
			}

			if (y < N - 1 && !isVisit[y + 1][x] && box[y + 1][x] != -1) {
				if (dist[y + 1][x] > dist[y][x] + 1) {
					queue.add(new Node(x, y + 1));
					dist[y + 1][x] = dist[y][x] + 1;
					isVisit[y + 1][x] = true;
				}
			}

			if (y > 0 && !isVisit[y - 1][x] && box[y - 1][x] != -1) {
				if (dist[y - 1][x] > dist[y][x] + 1) {
					queue.add(new Node(x, y - 1));
					dist[y - 1][x] = dist[y][x] + 1;
					isVisit[y - 1][x] = true;
				}
			}
		}


		int answer = dist[0][0];
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < M; k++) {
				answer = Math.max(answer, dist[i][k]);
			}
		}

		if (answer == Integer.MAX_VALUE) bw.write(String.valueOf(-1));
		else bw.write(String.valueOf(answer - 1));

		bw.flush();
		bw.close();
    }

	static class Node {
		public int x;
		public int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}