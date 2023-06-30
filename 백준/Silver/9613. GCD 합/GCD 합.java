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

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());

			long total = 0;
			int[] list = new int[N];
			for (int i = 0; i < N; i++) {
				list[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < N; i++) {

				for (int k = i + 1; k < N; k++) {
					total += gcd(list[i], list[k]);
				}
			}

			bw.write(String.valueOf(total));
			bw.newLine();
		}

		bw.flush();
		bw.close();
    }

	public static long gcd(int a, int b) {
		if (a % b == 0) return b;
		else return gcd(b, a % b);
	}
}
