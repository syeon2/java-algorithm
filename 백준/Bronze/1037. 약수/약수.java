import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 양수는 제일 작은값 * 제일 큰 값의 곱을 구하면 구할 수 있다.
		// 1개만 있는 수는 제곱을 해준다.

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			min = Math.min(min, num);
			max = Math.max(max, num);
		}

		bw.write(String.valueOf(min * max));
		bw.flush();
		bw.close();
    }
}
