import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] list = br.readLine().split(" ");

		int h = Integer.parseInt(list[0]);
		int m = Integer.parseInt(list[1]);

		if (m < 45) {
			if (h == 0) {
				bw.write("23 ");
				bw.write(String.valueOf(60 + (m - 45)));
			} else {
				bw.write(String.valueOf(h - 1));
				bw.write(" ");
				bw.write(String.valueOf(60 + (m - 45)));
			}
		} else {
			bw.write(String.valueOf(h));
			bw.write(" ");
			bw.write(String.valueOf(m - 45));
		}

		bw.flush();
		bw.close();
	}
}