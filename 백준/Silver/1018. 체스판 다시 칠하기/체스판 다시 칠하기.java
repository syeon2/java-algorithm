import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] info = br.readLine().split(" ");
		int N = Integer.parseInt(info[0]);
		int M = Integer.parseInt(info[1]);

		char[][] board = new char[N][M];
		for (int n = 0; n < N; n++) {
			char[] list = br.readLine().toCharArray();

			for (int m = 0; m < M; m++) {
				board[n][m] = list[m];
			}
		}

		int answer = Integer.MAX_VALUE;

		for (int i = 0; i <= N - 8; i++) {

			for (int k = 0; k <= M - 8; k++) {
				char target = board[i][k];

				int num = check(board, k, i, target);

				answer = Math.min(answer, num);
			}
		}

		System.out.println(answer);
	}

	public static int check(char[][] board, int x, int y, char target) {
		int diff1 = 0;
		int diff2 = 0;

		for (int i = y; i < y + 8; i++) {

			for (int k = x; k < x + 8; k++) {
				if (((i - y) % 2 == 0 && (k - x) % 2 == 0) || ((i - y) % 2 == 1 && (k - x) % 2 == 1)) {
					if (board[i][k] != target)
						diff1++;
					else
						diff2++;
				} else {
					if (board[i][k] == target)
						diff1++;
					else
						diff2++;
				}
			}
		}

		return Math.min(diff1, diff2);
	}
}
