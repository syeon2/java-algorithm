import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		boolean[][] isVisit = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int k = 0; k < N; k++) {
				board[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		boolean ans = recur(board, isVisit, 0, 0, N);

		if (ans) bw.write("HaruHaru");
		else bw.write("Hing");

		bw.flush();
		bw.close();
	}

	public static boolean recur(int[][] board, boolean[][] isVisit, int x, int y, int N) {
		if (x == N - 1 && y == N - 1) return true;
		else if (!isRange(x + 1, y, N) && !isRange(x, y + 1, N)) return false;

		// 오른쪽
		boolean result = false;

		int n1X = x + board[y][x];
		if (isRange(n1X, y, N) && !isVisit[y][n1X]) {
			isVisit[y][n1X] = true;
			if (recur(board, isVisit, n1X, y, N)) result = true;
		}

		// 아래쪽
		int n1Y = y + board[y][x];
		if (isRange(x, n1Y, N) && !isVisit[n1Y][x]) {
			isVisit[n1Y][x] = true;
			if (recur(board, isVisit, x, n1Y, N)) result = true;
		}

		if (result) return true;
		else return false;
	}

	public static boolean isRange(int x, int y, int N) {
		if (x >= 0 && x < N && y >= 0 && y < N) return true;

		return false;
	}
}
