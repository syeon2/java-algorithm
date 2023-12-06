import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] list = br.readLine().split(" ");

		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);

		if (a > b) bw.write(">");
		else if (b > a) bw.write("<");
		else bw.write("==");

		bw.flush();
		bw.close();
	}
}