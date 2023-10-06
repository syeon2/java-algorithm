import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int rA = reverse(A);
		int rB = reverse(B);

		bw.write(String.valueOf(Math.max(rA, rB)));
		bw.flush();
		bw.close();
	}

	public static int reverse(int num) {
		char[] list = String.valueOf(num).toCharArray();

		for (int i = 0; i < list.length / 2; i++) {
			char temp = list[i];

			list[i] = list[list.length - 1 - i];
			list[list.length - 1 - i] = temp;
		}

		return Integer.parseInt(String.valueOf(list));
	}
}