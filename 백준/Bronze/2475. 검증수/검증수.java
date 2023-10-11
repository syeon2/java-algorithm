import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(st.nextToken());
			total += (num * num);
		}

		bw.write(String.valueOf(total % 10));
		bw.flush();
		bw.close();
	}
}