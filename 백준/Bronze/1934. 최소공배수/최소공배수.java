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
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			bw.write(String.valueOf(lcm(A, B)));
			bw.newLine();
		}

		bw.flush();
		bw.close();
    }

	public static int gcm(int a, int b) {
		if (a % b == 0) return b;
		else return gcm(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcm(a, b);
	}
}
