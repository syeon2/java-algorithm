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

        int T = Integer.parseInt(br.readLine());

		int max = 1001;
		boolean[] list = new boolean[max];

		list[0] = list[1] = true;
		for (int i = 2; i < (int) Math.sqrt(max); i++) {

			if (list[i]) continue;

			for (int k = i * i; k < max; k += i) {
				list[k] = true;
			}
		}

		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(st.nextToken());

			if (!list[N]) count++;
		}

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
    }
}
