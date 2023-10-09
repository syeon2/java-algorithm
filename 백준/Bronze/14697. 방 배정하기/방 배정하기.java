import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int count = 0;

		while (N - (C * count) >= 0) {
			int temp = N - (C * count++);

			int count2 = 0;
			while (temp - (B * count2) >= 0) {
				int temp2 = temp - (B * count2++);

				if (temp2 % A == 0) {
					System.out.println(1);
					return;
				}
			}
		}

		System.out.println(0);
	}
}