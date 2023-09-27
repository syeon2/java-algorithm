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

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int e = 1;
		int s = 1;
		int m = 1;

		int answer = 1;

		while (true) {
			if (e == E && s == S && m == M) break;

			if (e == 15) e = 1;
			else e += 1;

			if (s == 28) s = 1;
			else s += 1;

			if (m == 19) m = 1;
			else m += 1;

			answer += 1;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}