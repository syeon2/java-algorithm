import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] list = new long[1000001];
		long[] answer = new long[1000001];

		for (int i = 1; i <= 1000000; i++) {
			for (int k = 1; k * i <= 1000000; k++) {
				list[k * i] += i;
			}

			answer[i] = answer[i - 1] + list[i];
		}

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			bw.write(String.valueOf(answer[N]));
			bw.newLine();
		}

		bw.flush();
		bw.close();
    }
}
