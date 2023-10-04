import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] info = br.readLine().split(" ");
		int N = Integer.parseInt(info[0]);
		int M = Integer.parseInt(info[1]);

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] list = new int[N];
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			int sum = 0;

			for (int k = i; k < N; k++) {
				sum += list[k];

				if (sum == M) {
					count++;
					break;
				}

				if (sum > M) break;
			}
		}

		System.out.println(count);
	}
}