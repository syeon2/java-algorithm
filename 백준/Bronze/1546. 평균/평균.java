import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		double[] list = new double[N];
		int max = 0;

		String[] str = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(str[i]);
			list[i] = (double) num;

			if (max < num) {
				max = num;
			}
		}

		double answer = 0;
		for (int i = 0; i < N; i++) {
			answer += list[i] / max * 100;
		}

		System.out.println(answer / N);
	}
}
