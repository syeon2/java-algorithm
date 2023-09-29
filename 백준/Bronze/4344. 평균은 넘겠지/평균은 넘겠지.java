import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {
			String[] sen = br.readLine().split(" ");

			int num = Integer.parseInt(sen[0]);

			int total = 0;
			for (int i = 1; i <= num; i++) {
				total += Integer.parseInt(sen[i]);
			}

			double avg = (double) total / (double) num;

			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (Integer.parseInt(sen[i]) > avg) {
					count++;
				}
			}

			System.out.printf("%.3f", (double) count / (double) num * 100);
			System.out.println("%");
		}
	}
}
