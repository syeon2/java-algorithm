import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static int[][] board;
	static int[][] map;
	static int country = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String houses = br.readLine();

			for (int k = 0; k < N; k++) {
				board[i][k] = Integer.parseInt(houses.substring(k, k + 1));
			}
		}

		for (int i = 0; i < N; i++) {

			for (int k = 0; k < N; k++) {
				if (board[i][k] == 1 && map[i][k] == 0) {
					dfs(i, k, N);
					country++;
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < N; k++) {
				answer = Math.max(answer, map[i][k]);
			}
		}
		bw.write(String.valueOf(answer));
		bw.newLine();

		int[] aList = new int[answer + 1];
		for (int i = 1; i <= answer; i++) {

			int count = 0;
			for (int k = 0; k < N; k++) {
				for (int l = 0; l < N; l++) {
					if (map[k][l] == i) count++;
				}
			}

			aList[i] = count;
		}

		Arrays.sort(aList);
		for (int i = 1; i <= answer; i++) {
			bw.write(String.valueOf(aList[i]));
			bw.newLine();
		}

		bw.flush();
		bw.close();
    }

	private static void dfs(int x, int y, int n) {
		if (x == n || y == n) {
			return;
		}

		map[x][y] = country;
		if (x < n - 1 && board[x + 1][y] == 1 && map[x + 1][y] == 0) {
			dfs(x + 1, y, n);
		}

		if (x > 0 && board[x - 1][y] == 1 && map[x - 1][y] == 0) {
			dfs(x - 1, y, n);
		}

		if (y < n - 1 && board[x][y + 1] == 1 && map[x][y + 1] == 0) {
			dfs(x, y + 1, n);
		}

		if (y > 0 && board[x][y - 1] == 1 && map[x][y - 1] == 0) {
			dfs(x, y - 1, n);
		}
	}
}