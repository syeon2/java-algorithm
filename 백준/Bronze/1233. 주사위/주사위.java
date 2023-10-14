import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		int s3 = Integer.parseInt(st.nextToken());

		int[] list = new int[s1 + s2 + s3 + 1];

		for (int i = 1; i <= s1; i++) {
			for (int k = 1; k <= s2; k++) {
				for (int j = 1; j <= s3; j++) {
					int index = i + k + j;

					list[index]++;
				}
			}
		}

		int max = 0;
		int index = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] > max) {
				max = list[i];
				index = i;
			}
		}

		bw.write(String.valueOf(index));
		bw.flush();
		bw.close();
	}
}