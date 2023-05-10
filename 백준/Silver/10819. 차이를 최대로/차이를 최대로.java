import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int answer = 0;
	static int[] list;
	static int[] aList;
	static boolean[] isVisit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		list = new int[N];
		aList = new int[N];
		isVisit = new boolean[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		recur(0, N);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	static void recur(int index, int n) {
		if (index == n) {
			int temp = 0;
			for (int i = 0; i < n - 1; i++) {
				temp += Math.abs(aList[i] - aList[i + 1]);
			}

			answer = Math.max(answer, temp);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (isVisit[i]) continue;
			isVisit[i] = true;
			aList[index] = list[i];
			recur(index + 1, n);
			isVisit[i] = false;
		}
	}
}