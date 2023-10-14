import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int totalN = 1;

		for (int i = 1; i <= N; i++) {
			totalN *= i;
		}

		int totalK = 1;

		for (int i = 1; i <= K; i++) {
			totalK *= i;
		}

		int minusNum = 1;

		for (int i = 1; i <= N - K; i++) {
			minusNum *= i;
		}

		bw.write(String.valueOf(totalN / (totalK * minusNum)));
		bw.flush();
		bw.close();
	}
}
