import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int count = Integer.parseInt(st.nextToken());
			String[] word = st.nextToken().split("");

			for (int k = 0; k < word.length; k++) {

				for (int l = 0; l < count; l++) {
					sb.append(word[k]);
				}
			}

			bw.write(sb.toString());
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}