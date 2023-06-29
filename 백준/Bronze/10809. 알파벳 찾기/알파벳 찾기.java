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

        int[] alpha = new int[26];
		char[] list = br.readLine().toCharArray();

		Arrays.fill(alpha, -1);

		for (int i = 0; i < list.length; i++) {
			int idx = list[i] - 97;

			if (alpha[idx] == -1) alpha[idx] = i;
		}

		for (int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
