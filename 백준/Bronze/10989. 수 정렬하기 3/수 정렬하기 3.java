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

        int N = Integer.parseInt(br.readLine());

		int[] list = new int[N];
		for (int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(list);

		Arrays.stream(list).forEach(num -> sb.append(num).append("\n"));

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
