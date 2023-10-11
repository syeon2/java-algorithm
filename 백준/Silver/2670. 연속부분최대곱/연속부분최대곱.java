import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		double[] list = new double[N];

		for (int i = 0; i < N; i++) {
			list[i] = Double.parseDouble(br.readLine());
		}

		double max = 0.0;

		for (int i = 0; i < N; i++) {
			double temp = 1.0;

			for (int k = i; k >= 0; k--) {
				temp *= list[k];

				if (max < temp) max = temp;
			}
		}

		System.out.printf("%.3f", max);
	}
}