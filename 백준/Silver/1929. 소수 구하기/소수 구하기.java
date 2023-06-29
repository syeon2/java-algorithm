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
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int max = 1000001;
		boolean[] list = new boolean[max];

		list[0] = list[1] = true;
		for (int i = 2; i < (int) Math.sqrt(max); i++) {

			for (int k = i * i; k < max; k += i) {

				if (list[k]) continue;

				list[k] = true;
			}
		}

		for (int i = M; i <= N; i++) {
			if (!list[i]) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}

		bw.flush();
		bw.close();
    }
}
