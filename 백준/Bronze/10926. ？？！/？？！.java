import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ans = br.readLine();

		StringBuilder sb = new StringBuilder();
		sb.append(ans).append("??!");

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}