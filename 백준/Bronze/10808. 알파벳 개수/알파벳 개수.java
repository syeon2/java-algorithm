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

        int[] alpha = new int[26];
		char[] list = br.readLine().toCharArray();

		for (char c : list) {
			alpha[c - 97]++;
		}

		for (int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
