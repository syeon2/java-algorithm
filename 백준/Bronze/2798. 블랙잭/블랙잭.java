import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		String[] strs = br.readLine().split(" ");
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(strs[i]);
		}

		int answer = 0;
		for (int i = 0; i < N; i++) {
			for (int k = i + 1; k < N; k++) {
				for (int l = k + 1; l < N; l++) {
					if (list[i] + list[k] + list[l] <= M) {
						answer = Math.max(answer, list[i] + list[k] + list[l]);
					}
				}
			}
		}

		System.out.println(answer);
	}
}
