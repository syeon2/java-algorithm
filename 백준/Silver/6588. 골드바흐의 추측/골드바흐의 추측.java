import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int max = 1000001;
		boolean[] list = new boolean[max];

		list[0] = list[1] = true;
		for (int i = 2; i <= (int) Math.sqrt(max); i++) {

			for (int k = i * i; k < max; k += i) {

				if (list[k]) continue;

				list[k] = true;
			}
		}

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;

			for (int i = 3; i < n; i++) {
				if (list[i]) continue;
				
				if (!list[n - i]) {
					sb.append(n).append(" = ")
						.append(i).append(" + ")
						.append(n - i).append("\n");

					break;
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
