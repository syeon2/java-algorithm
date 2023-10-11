import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int N = Integer.parseInt(br.readLine());

		if (C * R < N) bw.write(String.valueOf(0));
		else {
			int[][] board = new int[R + 2][C + 2];

			Arrays.fill(board[0], -1);
			Arrays.fill(board[board.length - 1], -1);

			for (int i = 0; i < board.length; i++) {
				board[i][0] = -1;
				board[i][board[i].length - 1] = -1;
			}

			// 상우하좌 = 0, 1, 2, 3
			int[] xList = {0, 1, 0, -1};
			int[] yList = {1, 0, -1, 0};

			int pos = 0;

			int count = 1;
			int x = 1;
			int y = 1;

			board[1][1] = 1;
			while (count != N) {
				int nx = xList[pos] + x;
				int ny = yList[pos] + y;

				if (board[ny][nx] == 0) {
					board[ny][nx] = ++count;

					x = nx;
					y = ny;
				} else {
					pos = turnPos(pos);

					nx = xList[pos] + x;
					ny = yList[pos] + y;

					board[ny][nx] = ++count;

					x = nx;
					y = ny;
				}
			}

			bw.write(String.valueOf(x));
			bw.write(" ");
			bw.write(String.valueOf(y));
		}
		
		bw.flush();
		bw.close();
	}

	public static int turnPos(int pos) {
		if (pos == 3) return 0;
		else return pos + 1;
	}
}
