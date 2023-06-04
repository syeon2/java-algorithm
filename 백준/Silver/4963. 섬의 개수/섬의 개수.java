import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[][] land;
	static boolean[][] isVisit;
	static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			if (w == 0 && h == 0) break;

			land = new int[h][w];
			isVisit = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine(), " ");

				for (int k = 0; k < w; k++) {
					land[i][k] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < h; i++) {
				for (int k = 0; k < w; k++) {
					if (land[i][k] == 1 && !isVisit[i][k]) {
						dfs(k, i, w, h);
						count++;
					}
				}
			}

			sb.append(count).append("\n");
			count = 0;
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	private static void dfs(int x, int y, int W, int H) {
		if (x == W || y == H) {
			return;
		}

		isVisit[y][x] = true;
		for (int i = y - 1; i <= y + 1; i++) {
			if (i < 0 || i > H - 1) continue;

			for (int k = x - 1; k <= x + 1; k++) {
				if (k < 0 || k > W - 1) continue;

				if (land[i][k] == 1 && !isVisit[i][k]) {
					dfs(k, i, W, H);
				}
			}
		}
	}
}