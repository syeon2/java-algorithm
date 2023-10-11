import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(br.readLine());

			while (true) {
				BigInteger bi = BigInteger.valueOf(num);

				if (bi.isProbablePrime(19)) {
					sb.append(num).append("\n");
					break;
				}
				else num += 1;
			}
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}