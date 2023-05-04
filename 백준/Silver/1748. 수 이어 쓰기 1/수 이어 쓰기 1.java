import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int answer = 0;

		for (int i = 1; i <= N; i++) {
			int pos = 0;

			if (i >= 10) {
				int index = i;

				while (index > 0) {
					pos++;
					index /= 10;
				}
			} else {
				pos++;
			}

			answer += pos;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}