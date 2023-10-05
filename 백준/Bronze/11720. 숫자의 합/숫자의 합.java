import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		char[] list = br.readLine().toCharArray();

		int total = 0;
		for (int i = 0; i < N; i++) {
			total += (list[i] - '0');
		}

		bw.write(String.valueOf(total));
		bw.flush();
		bw.close();
	}
}
