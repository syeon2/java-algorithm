import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger K = new BigInteger(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int bad = 0;
		for (int i = 2; i < L; i++) {
			if (K.remainder(BigInteger.valueOf(i)) == BigInteger.ZERO) {
				bad = i;
				break;
			}
		}

		if (bad != 0) bw.write(String.format("BAD %d", bad));
		else bw.write("GOOD");

		bw.flush();
		bw.close();
	}
}
