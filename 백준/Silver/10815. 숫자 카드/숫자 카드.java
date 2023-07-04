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

		int M = Integer.parseInt(br.readLine());
		int[] mList = new int[M];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			mList[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nList);
		
		for (int i = 0; i < M; i++) {

			int left = 0;
			int right = N - 1;

			int target = mList[i];

			boolean flag = false;
			while (left <= right) {
				int mid = (right + left) / 2;

				if (nList[mid] > target) {
					right = mid - 1;
				} else if (nList[mid] < target) {
					left = mid + 1;
				} else {
					flag = true;
					sb.append("1 ");
					break;
				}
			}

			if (!flag) sb.append("0 ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
