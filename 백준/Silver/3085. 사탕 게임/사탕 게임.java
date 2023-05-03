import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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

		int answer = 1;
		for (int i = 0; i < N; i++) {

			for (int k = 0; k < N - 1; k++) {
				char temp = board[i][k]; board[i][k] = board[i][k + 1]; board[i][k + 1] = temp;
				int check = check(board);
				if (answer < check) answer = check;
				temp = board[i][k]; board[i][k] = board[i][k + 1]; board[i][k + 1] = temp;
			}

			for (int k = 0; k < N - 1; k++) {
				char temp = board[k][i]; board[k][i] = board[k + 1][i]; board[k + 1][i] = temp;
				int check = check(board);
				if (answer < check) answer = check;
				temp = board[k][i]; board[k][i] = board[k + 1][i]; board[k + 1][i] = temp;
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	public static int check(char[][] board) {
		int N = board.length;

		int answer = 1;

		for (int i = 0; i < N; i++) {

			int count = 1;
			for (int k = 0; k < N - 1; k++) {
				if (board[i][k] == board[i][k + 1]) count++;
				else count = 1;

				if (answer < count) answer = count;
			}

			count = 1;
			for (int k = 0; k < N - 1; k++) {
				if (board[k][i] == board[k + 1][i]) count++;
				else count = 1;

				if (answer < count) answer = count;
			}
		}

		return answer;
	}
}