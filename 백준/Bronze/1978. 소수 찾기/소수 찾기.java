import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int answer = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			int count = 0;
			for (int k = 1; k <= num; k++) {
				if (num % k == 0) count++;
			}

			if (count == 2) answer++;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
