import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int curNum = 666;

		for (int i = 2; i <= N; i++) {

			int pos = 1;

			while (true) {
				if (String.valueOf(curNum + pos).contains("666")) {
					curNum += pos;
					break;
				} else {
					pos += 1;
				}
			}
		}

		System.out.println(curNum);
	}
}
