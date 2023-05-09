import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = i + 1;
		}

		for (int i = 0; i < N; i++) {
			sb.append(list[i]).append(" ");
		}
		sb.append("\n");
		while (nextPermutation(list));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }

	public static boolean nextPermutation(int[] list) {
		int i = list.length - 1;
		while (i > 0 && list[i - 1] >= list[i]) {
			i -= 1;
		}

		if (i <= 0) return false;

		int k = list.length - 1;
		while (list[k] <= list[i - 1]) {
			k -= 1;
		}

		int temp = list[k];
		list[k] = list[i - 1];
		list[i - 1] = temp;

		k = list.length - 1;
		while (i < k) {
			temp = list[i];
			list[i] = list[k];
			list[k] = temp;
			i += 1;
			k -= 1;
		}

		for (int num : list) {
			sb.append(num).append(" ");
		}
		sb.append("\n");

		return true;
	}
}