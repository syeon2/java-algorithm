import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] list = br.readLine().split(" ");
		int x = 0;
		int y = 0;

		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);
		int c = Integer.parseInt(list[2]);
		int d = Integer.parseInt(list[3]);
		int e = Integer.parseInt(list[4]);
		int f = Integer.parseInt(list[5]);

		a *= d;
		b *= d;
		c *= d;
		d *= Integer.parseInt(list[0]);
		e *= Integer.parseInt(list[0]);
		f *= Integer.parseInt(list[0]);

		y = (c - f) / (b - e);
		if (Integer.parseInt(list[0]) != 0) {
			x = (Integer.parseInt(list[2]) - (Integer.parseInt(list[1]) * y)) / Integer.parseInt(list[0]);
		} else {
			x = (Integer.parseInt(list[5]) - (Integer.parseInt(list[4]) * y)) / Integer.parseInt(list[3]);
		}

		System.out.println(x + " " + y);
	}
}
