import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int maxNum = 0;
		int maxCnt = 0;

		for (int i = N; i >= 1; i--) {

			int prev = N;
			int cur = i;

			int tempCnt = 2;
			while (true) {
				int next = prev - cur;

				if (next >= 0) tempCnt++;
				else break;

				prev = cur;
				cur = next;
				tempCnt++;
			}

			if (maxCnt < tempCnt) {
				maxNum = i;
				maxCnt = tempCnt;
			}
		}

		int prev = N;
		int cur = maxNum;

		StringBuilder sb = new StringBuilder();
		sb.append(prev).append(" ").append(cur).append(" ");

		int cntAns = 2;

		while (true) {
			int next = prev - cur;

			prev = cur;
			cur = next;

			if (cur >= 0) {
				sb.append(cur).append(" ");
				cntAns++;
			}
			else break;
		}

		bw.write(String.valueOf(cntAns));
		bw.newLine();
		bw.write(sb.toString());

		bw.flush();
		bw.close();
	}
}
