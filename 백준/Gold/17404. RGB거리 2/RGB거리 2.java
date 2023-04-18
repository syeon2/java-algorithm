import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int[][] nList;
	static int[][] rDp;
	static int[][] gDp;
	static int[][] bDp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		nList = new int[N + 1][3];
		rDp = new int[N + 1][3];
		gDp = new int[N + 1][3];
		bDp = new int[N + 1][3];

		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int k = 0; k < 3; k++) {
				nList[i][k] = Integer.parseInt(st.nextToken());
			}
		}

		// bottom-up
		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				for (int k = 0; k < 3; k++) {
					if (k != 0) rDp[i][k] = 1001;
					else rDp[i][k] = nList[i][k];
				}
			} else {
				for (int k = 0; k < 3; k++) {
					if (k == 0) rDp[i][k] = Math.min(rDp[i - 1][1], rDp[i - 1][2]) + nList[i][k];
					else if (k == 1) rDp[i][k] = Math.min(rDp[i - 1][0], rDp[i - 1][2]) + nList[i][k];
					else rDp[i][k] = Math.min(rDp[i - 1][0], rDp[i - 1][1]) + nList[i][k];
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				for (int k = 0; k < 3; k++) {
					if (k != 1) gDp[i][k] = 1001;
					else gDp[i][k] = nList[i][k];
				}
			} else {
				for (int k = 0; k < 3; k++) {
					if (k == 0) gDp[i][k] = Math.min(gDp[i - 1][1], gDp[i - 1][2]) + nList[i][k];
					else if (k == 1) gDp[i][k] = Math.min(gDp[i - 1][0], gDp[i - 1][2]) + nList[i][k];
					else gDp[i][k] = Math.min(gDp[i - 1][0], gDp[i - 1][1]) + nList[i][k];
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				for (int k = 0; k < 3; k++) {
					if (k != 2) bDp[i][k] = 1001;
					else bDp[i][k] = nList[i][k];
				}
			} else {
				for (int k = 0; k < 3; k++) {
					if (k == 0) bDp[i][k] = Math.min(bDp[i - 1][1], bDp[i - 1][2]) + nList[i][k];
					else if (k == 1) bDp[i][k] = Math.min(bDp[i - 1][0], bDp[i - 1][2]) + nList[i][k];
					else bDp[i][k] = Math.min(bDp[i - 1][0], bDp[i - 1][1]) + nList[i][k];
				}
			}
		}

		int answer = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			if (i != 0) answer = Math.min(answer, rDp[N][i]);
			if (i != 1) answer = Math.min(answer, gDp[N][i]);
			if (i != 2) answer = Math.min(answer, bDp[N][i]);
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}