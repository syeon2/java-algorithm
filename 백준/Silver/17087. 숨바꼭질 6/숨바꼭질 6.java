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
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());

		int[] list = new int[N];
		st = new StringTokenizer(br.readLine(), " ");


		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			list[i] = Math.abs(list[i] - S);
		}

		int max = list[0];

		for (int i = 0; i < N; i++) {
			max = gcd(max, list[i]);
		}

		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
    }

	public static int gcd(int a, int b) {
		if (a % b == 0) return b;
		else return gcd(b, a % b);
	}
}
