import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int max = -1000001;
		int min = 1000001;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (max < num) max = num;
			if (min > num) min = num;
		}

		bw.write(String.valueOf(min));
		bw.write(" ");
		bw.write(String.valueOf(max));

		bw.flush();
		bw.close();
	}
}