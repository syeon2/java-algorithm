import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] board;
	static int[][] dist;
	static boolean[][] isVisit;
	static Queue<Node> queue = new LinkedList<>();
	static int answer = Integer.MAX_VALUE;

	static class Node {

		public int x;
		public int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		board = new int[M][N];
		dist = new int[M][N];
		isVisit = new boolean[M][N];

		for (int i = 0; i < M; i++) {
			String str = br.readLine();

			for (int k = 0; k < N; k++) {
				board[i][k] = Integer.parseInt(str.substring(k, k + 1));
			}
		}

		queue.add(new Node(0, 0));
		dist[0][0] = 1;
		isVisit[0][0] = true;

		// bfs
		while (!queue.isEmpty()) {
			Node popped = queue.remove();
			int x = popped.x;
			int y = popped.y;

			if (x < N - 1 && board[y][x + 1] == 1 && !isVisit[y][x + 1] && board[y][x + 1] == 1) {
				queue.add(new Node(x + 1, y));
				dist[y][x + 1] = dist[y][x] + 1;
				isVisit[y][x + 1] = true;
			}
			if (x > 0 && board[y][x - 1] == 1 && !isVisit[y][x - 1] && board[y][x - 1] == 1) {
				queue.add(new Node(x - 1, y));
				dist[y][x - 1] = dist[y][x] + 1;
				isVisit[y][x - 1] = true;
			}
			if (y < M - 1 && board[y + 1][x] == 1 && !isVisit[y + 1][x] && board[y + 1][x] == 1) {
				queue.add(new Node(x, y + 1));
				dist[y + 1][x] = dist[y][x] + 1;
				isVisit[y + 1][x] = true;
			}
			if (y > 0 && board[y - 1][x] == 1 && !isVisit[y - 1][x] && board[y - 1][x] == 1) {
				queue.add(new Node(x, y - 1));
				dist[y - 1][x] = dist[y][x] + 1;
				isVisit[y - 1][x] = true;
			}
		}

		bw.write(String.valueOf(dist[M - 1][N - 1]));
		bw.flush();
		bw.close();
    }
}