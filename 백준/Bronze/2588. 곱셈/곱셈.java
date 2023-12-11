import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());

		String[] list = br.readLine().split("");

		int b1 = Integer.parseInt(list[0]);
		int b2 = Integer.parseInt(list[1]);
		int b3 = Integer.parseInt(list[2]);

		int three = A * b3;
		bw.write(String.valueOf(three));
		bw.newLine();

		int four = A * b2;
		bw.write(String.valueOf(four));
		bw.newLine();

		int five = A * b1;
		bw.write(String.valueOf(five));
		bw.newLine();

		bw.write(String.valueOf(three + four * 10 + five * 100));

		bw.flush();
		bw.close();
	}
}