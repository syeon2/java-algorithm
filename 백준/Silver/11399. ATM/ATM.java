import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list);

		int ans = 0;

		for (int i = 0; i < list.length; i++) {
			ans += (list[i] * (N - i));
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}