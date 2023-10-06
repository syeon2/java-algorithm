import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int na = A;
		if (na % 2 == 1) na += 1;

		int nb = B;
		if (nb % 2 == 1) nb += 1;

		if (na == nb) bw.write(String.valueOf(1));
		else {
			int count = 1;

			while (true) {
				if (A % 2 == 1) {
					A += 1;
					A /= 2;
				} else A /= 2;

				if (B % 2 == 1) {
					B += 1;
					B /= 2;
				} else B /= 2;

				if (A == B) break;

				count++;
			}

			bw.write(String.valueOf(count));
		}

		bw.flush();
		bw.close();
	}
}
