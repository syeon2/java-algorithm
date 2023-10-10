import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int start = Integer.parseInt(st.nextToken());

		if (start == 1) {
			int count = 1;

			while (count++ < 8) {
				if (++start != Integer.parseInt(st.nextToken())) {
					bw.write("mixed");
					bw.flush();
					bw.close();

					return;
				}
			}

			bw.write("ascending");
			bw.flush();
			bw.close();
		} else if (start == 8) {
			int count = 1;

			while (count++ < 8) {
				if (--start != Integer.parseInt(st.nextToken())) {
					bw.write("mixed");
					bw.flush();
					bw.close();

					return;
				}
			}

			bw.write("descending");
			bw.flush();
			bw.close();
		} else {
			bw.write("mixed");
			bw.flush();
			bw.close();
		}
	}
}
