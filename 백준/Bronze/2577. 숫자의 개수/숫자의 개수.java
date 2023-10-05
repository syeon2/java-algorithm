import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int total = A * B * C;

		char[] list = String.valueOf(total).toCharArray();

		int[] cache = new int[10];
		for (int i = 0; i < list.length; i++) {
			cache[list[i] - '0']++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cache.length; i++) {
			sb.append(cache[i]).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
