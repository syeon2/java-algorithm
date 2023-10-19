import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int max = -1;
		int x = 0;
		int y = 0;

		for (int i = 0; i < 9; i++) {

			st = new StringTokenizer(br.readLine(), " ");
			for (int k = 0; k < 9; k++) {
				int num = Integer.parseInt(st.nextToken());

				if (max < num) {
					max = num;
					x = k + 1;
					y = i + 1;
				}
			}
		}

		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(y));
		bw.write(" ");
		bw.write(String.valueOf(x));

		bw.flush();
		bw.close();
	}
}