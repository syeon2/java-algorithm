import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 주어진 보드 안에서 먼저 문자를 교환한 후 전체 체크 한다.
		// 성능을 개선하고 싶으면 교환된 열, 행만 비교해서 Max값을 갱신시킨다.

		int N = Integer.parseInt(br.readLine());
		char[][] board = new char[N][N];
		int answer = 0;

		for (int y = 0; y < N; y++) {

			char[] list = br.readLine().toCharArray();
			for (int k = 0; k < N; k++) {
				board[y][k] = list[k];
			}
		}

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N - 1; x++) {
				char temp = board[y][x];

				board[y][x] = board[y][x + 1];
				board[y][x + 1] = temp;

				answer = Math.max(answer, check(board, x, y));
				answer = Math.max(answer, check(board, x + 1, y));

				board[y][x + 1] = board[y][x];
				board[y][x] = temp;
			}
		}

		for (int y = 0; y < N - 1; y++) {
			for (int x = 0; x < N; x++) {
				char temp = board[y][x];

				board[y][x] = board[y + 1][x];
				board[y + 1][x] = temp;

				answer = Math.max(answer, check(board, x, y));
				answer = Math.max(answer, check(board, x, y + 1));

				board[y + 1][x] = board[y][x];
				board[y][x] = temp;
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int check(char[][] board, int x, int y) {
		int temp = 1;

		int xLine = 1;
		for (int y2 = 0; y2 < board.length - 1; y2++) {
			if (board[y2][x] == board[y2 + 1][x]) xLine++;
			else {
				temp = Math.max(temp, xLine);
				xLine = 1;
			}
		}
		temp = Math.max(temp, xLine);

		int yLine = 1;
		for (int x2 = 0; x2 < board.length - 1; x2++) {
			if (board[y][x2] == board[y][x2 + 1]) yLine++;
			else {
				temp = Math.max(temp, yLine);
				yLine = 1;
			}
		}
		temp = Math.max(temp, yLine);

		return temp;
	}
}
