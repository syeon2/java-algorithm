import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[] list = new int[101];

		list[A]++;
		list[B]++;
		list[C]++;

		int answer = 0;
		int count = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] > 0) count += list[i];

			if (count >= 2) {
				answer = i;
				break;
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
