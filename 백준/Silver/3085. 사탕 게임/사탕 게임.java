import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		char[][] board = new char[N][N];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			for (int k = 0; k < N; k++) {
				board[i][k] = str.charAt(k);
			}
		}

		int answer = 0;

		for (int i = 0; i < N; i++) {
			for (int k = 0; k < N - 1; k++) {
				// row
				char temp1 = board[i][k];
				board[i][k] = board[i][k + 1];
				board[i][k + 1] = temp1;
				int rowCheck = check(board);
				board[i][k + 1] = board[i][k];
				board[i][k] = temp1;

				// column
				char temp2 = board[k][i];
				board[k][i] = board[k + 1][i];
				board[k + 1][i] = temp2;
				int columnCheck = check(board);
				board[k + 1][i] = board[k][i];
				board[k][i] = temp2;

				answer = Math.max(answer,
					Math.max(rowCheck, columnCheck));
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int check(char[][] board) {
		int N = board.length;

		int answer = 0;
		for (int i = 0; i < N; i++) {

			int rowCount = 1;
			int columnCount = 1;
			for (int k = 0; k < N - 1; k++) {
				if (board[i][k] == board[i][k + 1]) rowCount += 1;
				else rowCount = 1;

				if (board[k][i] == board[k + 1][i]) columnCount += 1;
				else columnCount = 1;

				answer = Math.max(answer,
					Math.max(rowCount, columnCount));
			}
		}

		return answer;
	}
}