import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static int answer = 1;
	static int EMax = 15;
	static int SMax = 28;
	static int MMax = 19;

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
		while (!(e == E && s == S && m == M)) {
			if (e == EMax) {
				e = 1;
			} else {
				e += 1;
			}

			if (s == SMax) {
				s = 1;
			} else {
				s += 1;
			}

			if (m == MMax) {
				m = 1;
			} else {
				m += 1;
			}

			answer++;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}
