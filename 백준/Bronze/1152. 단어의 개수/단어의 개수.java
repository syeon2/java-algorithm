import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		if (str.equals(" ")) bw.write(String.valueOf(0));
		else {
			String[] list = str.trim().split(" ");

			bw.write(String.valueOf(list.length));
		}

		bw.flush();
		bw.close();
	}
}
