import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
		int[] nList = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nList);

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());

			int left = 0;
			int right = N - 1;
			int answer1 = -1;
			// 하한
			while (left <= right) {

				int mid = (left + right) / 2;

				if (target < nList[mid]) {
					right = mid - 1;
				} else if (target > nList[mid]) {
					left = mid + 1;
				} else {
					answer1 = mid;
					right = mid - 1;
				}
			}

			int left2 = 0;
			int right2 = N - 1;
			int answer2 = -1;
			// 상한
			while (left2 <= right2) {

				int mid = (left2 + right2) / 2;

				if (target < nList[mid]) {
					right2 = mid - 1;
				} else if (target > nList[mid]) {
					left2 = mid + 1;
				} else {
					answer2 = mid + 1;
					left2 = mid + 1;
				}
			}

			sb.append(answer2 - answer1).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
