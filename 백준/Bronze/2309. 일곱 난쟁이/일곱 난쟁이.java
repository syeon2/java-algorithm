import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int total = 0;
        int[] list = new int[9];
		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			list[i] = num;
			total += num;
		}
		Arrays.sort(list);

		for (int i = 0; i < 9; i++) {
			for (int k = i + 1; k < 9; k++) {
				if (total - list[i] - list[k] == 100) {
					for (int l = 0; l < 9; l++) {
						if (l == i || l == k) continue;

						sb.append(list[l]).append("\n");
					}

					bw.write(sb.toString());
					bw.flush();
					bw.close();
					return;
				}
			}
		}
    }
}