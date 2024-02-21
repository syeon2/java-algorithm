import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		char[][] board = new char[N][M];

		for (int i = 0; i < N; i++) {
			String str = sc.next();

			for (int k = 0; k < M; k++) {
				board[i][k] = str.charAt(k);
			}
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i <= N - 8; i++) {

			for (int k = 0; k <= M - 8; k++) {
				int stone = board[i][k];

				int cnt1 = 0;
				int cnt2 = 0;

				for (int y1 = i; y1 < i + 8; y1++) {
					for (int x1 = k; x1 < k + 8; x1++) {

						if (i % 2 == y1 % 2) {
							if (k % 2 == x1 % 2 && board[y1][x1] != stone) cnt1++;
							else if (k % 2 != x1 % 2 && board[y1][x1] == stone) cnt1++;
							else cnt2++;
						} else if (i % 2 != y1 % 2) {
							if (k % 2 == x1 % 2 && board[y1][x1] == stone) cnt1++;
							else if (k % 2 != x1 % 2 && board[y1][x1] != stone) cnt1++;
							else cnt2++;
						}
					}
				}

				ans = Math.min(ans, Math.min(cnt1, cnt2));
			}
		}

		System.out.print(ans);
	}
}
