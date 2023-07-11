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

        boolean[] list = new boolean[1000001];

		list[0] = list[1] = true;
		for (int i = 2; i <= 1000000; i++) {
			for (int k = i + i; k <= 1000000; k += i) {
				list[k] = true;
			}
		}

		int num = -1;

		while ((num = Integer.parseInt(br.readLine())) != 0) {

			for (int i = 3; i < num; i += 2) {
				if (!list[i] && !list[num - i]) {
					sb.append(num)
						.append(" = ")
						.append(i)
						.append(" + ")
						.append(num - i)
						.append("\n");

					break;
				}
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
