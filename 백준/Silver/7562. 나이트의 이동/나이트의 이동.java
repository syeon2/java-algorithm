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
		StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {

			int L = Integer.parseInt(br.readLine());

			int[][] board = new int[L][L];
			int[][] dist = new int[L][L];
			boolean[][] isVisit = new boolean[L][L];
			Queue<Node> queue = new LinkedList<>();

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int X1 = Integer.parseInt(st.nextToken());
			int Y1 = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine(), " ");
			int X2 = Integer.parseInt(st.nextToken());
			int Y2 = Integer.parseInt(st.nextToken());

			queue.add(new Node(X1, Y1));
			dist[Y1][X1] = 1;
			isVisit[Y1][X1] = true;

			// bfs
			while (!queue.isEmpty()) {
				Node node = queue.remove();
				int x = node.x;
				int y = node.y;

				if (x < L - 1 && y > 1 && !isVisit[y - 2][x + 1]) {
					queue.add(new Node(x + 1, y - 2));
					dist[y - 2][x + 1] = dist[y][x] + 1;
					isVisit[y - 2][x + 1] = true;
				}

				if (x < L - 2 && y > 0 && !isVisit[y - 1][x + 2]) {
					queue.add(new Node(x + 2, y - 1));
					dist[y - 1][x + 2] = dist[y][x] + 1;
					isVisit[y - 1][x + 2] = true;
				}

				if (x < L - 1 && y < L - 2 && !isVisit[y + 2][x + 1]) {
					queue.add(new Node(x + 1, y + 2));
					dist[y + 2][x + 1] = dist[y][x] + 1;
					isVisit[y + 2][x + 1] = true;
				}

				if (x < L - 2 && y < L - 1 && !isVisit[y + 1][x + 2]) {
					queue.add(new Node(x + 2, y + 1));
					dist[y + 1][x + 2] = dist[y][x] + 1;
					isVisit[y + 1][x + 2] = true;
				}

				if (x > 0 && y > 1 && !isVisit[y - 2][x - 1]) {
					queue.add(new Node(x - 1, y - 2));
					dist[y - 2][x - 1] = dist[y][x] + 1;
					isVisit[y - 2][x - 1] = true;
				}

				if (x > 1 && y > 0 && !isVisit[y - 1][x - 2]) {
					queue.add(new Node(x - 2, y - 1));
					dist[y - 1][x - 2] = dist[y][x] + 1;
					isVisit[y - 1][x - 2] = true;
				}

				if (x > 0 && y < L - 2 && !isVisit[y + 2][x - 1]) {
					queue.add(new Node(x - 1, y + 2));
					dist[y + 2][x - 1] = dist[y][x] + 1;
					isVisit[y + 2][x - 1] = true;
				}

				if (x > 1 && y < L - 1 && !isVisit[y + 1][x - 2]) {
					queue.add(new Node(x - 2, y + 1));
					dist[y + 1][x - 2] = dist[y][x] + 1;
					isVisit[y + 1][x - 2] = true;
				}
			}

			sb.append(dist[Y2][X2] - 1).append("\n");
		}

		bw.write(sb.toString());
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