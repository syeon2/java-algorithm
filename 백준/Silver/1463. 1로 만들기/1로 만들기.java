import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

		memo = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			memo[i] = memo[i - 1] + 1;

			if (i % 3 == 0) memo[i] = Math.min(memo[i], memo[i / 3] + 1);
			if (i % 2 == 0) memo[i] = Math.min(memo[i], memo[i / 2] + 1);
		}

		bw.write(String.valueOf(memo[N] - 1));
		bw.flush();
		bw.close();
    }
}
