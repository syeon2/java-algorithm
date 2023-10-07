import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		int n = 1;

		while (true) {
			int count = 0;

			if (n % a == 0) count++;
			if (n % b == 0) count++;
			if (n % c == 0) count++;
			if (n % d == 0) count++;
			if (n % e == 0) count++;

			if (count >= 3) break;
			else n++;
		}

		bw.write(String.valueOf(n));
		bw.flush();
		bw.close();
	}
}