import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		for (int i = 1000; i <= 9999; i++) {
			if (sum10(i) == sum12(i) && sum12(i) == sum16(i)) sb.append(i).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static int sum10(int num) {
		int temp = 0;

		while (num > 0) {
			temp += num % 10;
			num /= 10;
		}

		return temp;
	}

	public static int sum12(int num) {
		int sum = 0;

		while (num > 0) {
			sum += num % 12;

			num /= 12;
		}

		return sum;
	}

	public static int sum16(int num) {
		int sum = 0;

		while (num > 0) {
			sum += num % 16;

			num /= 16;
		}

		return sum;
	}
}
