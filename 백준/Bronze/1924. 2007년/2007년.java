import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());

		int[] list = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int total = 0;

		for (int i = 1; i < M; i++) {
			total += list[i];
		}

		total += D;

		if (total % 7 == 1) bw.write("MON");
		else if (total % 7 == 2) bw.write("TUE");
		else if (total % 7 == 3) bw.write("WED");
		else if (total % 7 == 4) bw.write("THU");
		else if (total % 7 == 5) bw.write("FRI");
		else if (total % 7 == 6) bw.write("SAT");
		else bw.write("SUN");

		bw.flush();
		bw.close();
	}
}