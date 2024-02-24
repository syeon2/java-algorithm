import java.io.*;
import java.util.*;

public class Main {

	public static Set<Integer> set = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		int[] list = new int[N];
		boolean[] isUse = new boolean[N];

		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		recur(isUse, list, K, "");

		bw.write(String.valueOf(set.size()));
		bw.flush();
		bw.close();
	}

	public static void recur(boolean[] isUse, int[] list, int k, String str) {
		if (k == 0) {
			set.add(Integer.parseInt(str));
			return;
		}

		for (int i = 0; i < list.length; i++) {
			if (isUse[i]) continue;

			isUse[i] = true;
			recur(isUse, list, k - 1, str.concat(String.valueOf(list[i])));
			isUse[i] = false;
		}
	}
}
