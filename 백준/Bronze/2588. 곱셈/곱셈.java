import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		char[] list = String.valueOf(B).toCharArray();

		int pos = 1;
		int total = 0;

		for (int i = list.length - 1; i >= 0; i--) {
			int num = A * (list[i] - '0');

			System.out.println(num);

			total += num * pos;
			pos *= 10;
		}

		System.out.println(total);
	}
}