import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		String[] list = String.valueOf(b).split("");

		int three = a * Integer.parseInt(list[2]);
		int four = a * Integer.parseInt(list[1]);
		int five = a * Integer.parseInt(list[0]);

		int six = three + (four * 10) + (five * 100);

		bw.write(String.valueOf(three));
		bw.newLine();

		bw.write(String.valueOf(four));
		bw.newLine();

		bw.write(String.valueOf(five));
		bw.newLine();

		bw.write(String.valueOf(six));

		bw.flush();
		bw.close();
	}
}