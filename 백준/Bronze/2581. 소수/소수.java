import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int min = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());

		boolean[] list = new boolean[max + 1];

		list[1] = true;
		for (int i = 2; i <= max; i++) {

			for (int k = i + i; k <= max; k += i) {
				list[k] = true;
			}
		}

		int ansMin = -1;
		int sum = 0;
		for (int i = min; i <= max; i++) {
			if (!list[i]) {
				sum += i;

				if (ansMin == -1) ansMin = i;
			}
		}

		if (ansMin == -1) bw.write(String.valueOf(ansMin));
		else {
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(ansMin));
		}

		bw.flush();
		bw.close();
	}
}