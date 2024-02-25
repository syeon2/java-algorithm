import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		int N = Integer.parseInt(br.readLine());

		int ans = 0;
		for (int n = 0; n < N; n++) {
			String temp = br.readLine();

			StringBuilder sb = new StringBuilder();
			boolean isHave = sb.append(temp)
				.append(temp).append(temp)
				.toString().contains(str);

			if (isHave) ans++;
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}