import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if (M >= 45) {
			bw.write(String.valueOf(H));
			bw.write(" ");
			bw.write(String.valueOf(M - 45));
		} else {
			if (H == 0) {
				bw.write("23 ");
				bw.write(String.valueOf(60 + (M - 45)));
			} else {
				bw.write(String.valueOf(H - 1));
				bw.write(" ");
				bw.write(String.valueOf(60 + (M - 45)));
			}
		}

		bw.flush();
		bw.close();
	}
}