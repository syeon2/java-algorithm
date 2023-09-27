import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] pos = br.readLine().split(" ");
		int N = Integer.parseInt(pos[0]);
		int M = Integer.parseInt(pos[1]);

		char[][] board = new char[N][M];

		for (int i = 0; i < N; i++) {
			char[] list = br.readLine().toCharArray();

			for (int k = 0; k < M; k++) {
				board[i][k] = list[k];
			}
		}

		int answer = Integer.MAX_VALUE;

		for (int i = 0; i <= N - 8; i++) {
			for (int k = 0; k <= M - 8; k++) {
				char target = board[i][k];

				int count1 = 0;
				int count2 = 0;
				for (int z = i; z < i + 8; z++) {
					for (int q = k; q < k + 8; q++) {
						if (((z - i) % 2 == 0 && (q - k) % 2 == 0) ||
							((z - i) % 2 == 1 && (q - k) % 2 == 1)) {
							if (target != board[z][q]) {
								count1++;
							} else
								count2++;
						} else {
							if (target == board[z][q]) {
								count1++;
							} else
								count2++;
						}
					}
				}

				answer = Math.min(answer, Math.min(count1, count2));
			}
		}

		System.out.println(answer);
	}
}
