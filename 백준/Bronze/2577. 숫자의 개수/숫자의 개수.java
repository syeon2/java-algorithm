import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		String x = String.valueOf(A * B * C);
		int[] list = new int[10];

		for (int i = 0; i < x.length(); i++) {
			int idx = x.charAt(i) - '0';

			list[idx]++;
		}

		for (int i = 0; i < 10; i++) {
			bw.write(String.valueOf(list[i]));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}