import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		int num = Integer.parseInt(str);
		int len = str.length();

		int[] list = new int[len];

		for (int i = 0; i < list.length; i++) {
			int n = num % 10;
			num /= 10;

			list[i] = n;
		}

		Arrays.sort(list);

		StringBuilder sb = new StringBuilder();

		for (int i = list.length - 1; i >= 0; i--) {
			sb.append(list[i]);
		}

		int answer = Integer.parseInt(sb.toString());

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}