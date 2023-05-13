import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[][][] list = {
		{{0,1}, {0,2}, {0,3}},
		{{1,0}, {2,0}, {3,0}},
		{{1,0}, {1,1}, {1,2}},
		{{0,1}, {1,0}, {2,0}},
		{{0,1}, {0,2}, {1,2}},
		{{1,0}, {2,0}, {2,-1}},
		{{0,1}, {0,2}, {-1,2}},
		{{1,0}, {2,0}, {2,1}},
		{{0,1}, {0,2}, {1,0}},
		{{0,1}, {1,1}, {2,1}},
		{{0,1}, {1,0}, {1,1}},
		{{0,1}, {-1,1}, {-1,2}},
		{{1,0}, {1,1}, {2,1}},
		{{0,1}, {1,1}, {1,2}},
		{{1,0}, {1,-1}, {2,-1}},
		{{0,1}, {0,2}, {-1,1}},
		{{0,1}, {0,2}, {1,1}},
		{{1,0}, {2,0}, {1,1}},
		{{1,0}, {2,0}, {1,-1}},
	};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] board = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			for (int k = 0; k < M; k++) {
				board[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		int answer = 0;

		for (int i = 0; i < N; i++) {
			for (int k = 0; k < M; k++) {

				for (int l = 0; l < list.length; l++) {

					int[][] block = list[l];
					int count = board[i][k];
					boolean flag = false;

					for (int z = 0; z < 3; z++) {
						int x = i + block[z][0];
						int y = k + block[z][1];

						if (x < 0 || y < 0 || x >= N || y >= M) {
							flag = true;
							break;
						};
						count += board[x][y];
					}

					if (!flag) answer = Math.max(answer, count);
				}
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}