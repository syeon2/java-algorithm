import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			String[] list = br.readLine().split(" ");
			int count = Integer.parseInt(list[0]);
			String[] str = list[1].split("");

			for (int i = 0; i < str.length; i++) {

				String s = str[i];
				for (int k = 0; k < count; k++) {
					sb.append(s);
				}
			}

			sb.append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
