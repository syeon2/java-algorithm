import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		if (M > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < M; i++) {
				int btn = Integer.parseInt(st.nextToken());

				broken[btn] = true;
			}
		}

		int answer = Math.abs(N - 100);
		for (int i = 0; i < 1000000; i++) {
			int len = possible(i);

			if (len > 0) {
				int press = Math.abs(N - i);

				answer = Math.min(answer, press + len);
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }

	private static int possible(int channel) {
		if (channel == 0) {
			if (broken[channel]) return 0;
			else return 1;
		}

		int len = 0;
		while (channel > 0) {
			if (broken[channel % 10]) return 0;

			len += 1;
			channel /= 10;
		}

		return len;
	}
}