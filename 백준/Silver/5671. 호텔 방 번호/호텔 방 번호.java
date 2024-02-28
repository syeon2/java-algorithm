import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (sc.hasNextInt()) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int cnt = 0;
			for (int i = N; i <= M; i++) {
				int[] nums = new int[10];

				String strNum = String.valueOf(i);

				for (int k = 0; k < strNum.length(); k++) {
					int idx = strNum.charAt(k) - '0';

					nums[idx]++;
				}

				boolean flag = true;

				for (int k = 0; k < nums.length; k++) {
					if (nums[k] >= 2) flag = false;
				}

				if (flag) cnt++;
			}

			bw.write(String.valueOf(cnt));
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}