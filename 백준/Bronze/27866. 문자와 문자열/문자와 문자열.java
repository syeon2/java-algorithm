import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int index = Integer.parseInt(br.readLine());

		char c = str.charAt(index - 1);

		bw.write(String.valueOf(c));
		bw.flush();
		bw.close();
	}
}