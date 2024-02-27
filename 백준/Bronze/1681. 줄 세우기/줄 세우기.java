import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int curNum = 0;

		while (N > 0) {
			curNum++;

			String str = String.valueOf(curNum);

			if (!str.contains(String.valueOf(L))) {
				N--;
			}
		}

		bw.write(String.valueOf(curNum));
		bw.flush();
		bw.close();
	}
}
