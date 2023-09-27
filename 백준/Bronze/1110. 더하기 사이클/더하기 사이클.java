import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int num = N;
		int count = 0;
		while (true) {
			String strNum = String.valueOf(num);

			if (strNum.length() == 1) strNum = "0".concat(strNum);

			char[] list = strNum.toCharArray();
			int sum = list[0] - '0' + list[1] - '0';

			char[] split = String.valueOf(sum).toCharArray();
			int i = split[split.length - 1] - '0';
			int newNum = (list[1] - '0') * 10 + i;

			count++;
			if (N == newNum) break;

			num = newNum;
		}

		System.out.println(count);
	}
}
