import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] list = br.readLine().split(" ");

		double answer = Double.parseDouble(list[0]) / Double.parseDouble(list[1]);

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}