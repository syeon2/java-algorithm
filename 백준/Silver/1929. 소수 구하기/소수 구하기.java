import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

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

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		for (int i = A; i <= B; i++) {
			if (!list[i]) sb.append(i).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
