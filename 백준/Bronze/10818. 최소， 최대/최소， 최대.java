import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int min = 1000001;
		int max = -1000001;

		String[] list = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(list[i]);

			if (num < min) min = num;
			if (num > max) max = num;
		}

		bw.write(String.valueOf(min));
		bw.write(" ");
		bw.write(String.valueOf(max));

		bw.flush();
		bw.close();
	}
}