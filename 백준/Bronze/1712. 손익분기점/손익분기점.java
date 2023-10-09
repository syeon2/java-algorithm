import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());

		long answer = 1;

		if (B >= C) {
			answer = -1;
		} else {
			answer = A / (C - B) + 1;
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}