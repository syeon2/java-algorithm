import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String list = br.readLine();

		int ans = 0;

		for (int i = 0; i < list.length(); i++) {
			ans += list.charAt(i) - '0';
		}

		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}