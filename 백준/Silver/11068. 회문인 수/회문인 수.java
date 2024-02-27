import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int n = 0; n < N; n++) {

			int num = Integer.parseInt(br.readLine());

			boolean flag = false;
			for (int i = 2; i <= 64; i++) {
				if (isFalin(num, i)) {
					flag = true;
					break;
				}
			}

			if (flag) sb.append(1).append("\n");
			else sb.append(0).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	public static boolean isFalin(int n, int i) {
		char[] changeNum = changeFor(n, i).toCharArray();
		
		for (int k = 0; k < changeNum.length / 2; k++) {
			if (changeNum[k] != changeNum[changeNum.length - 1 - k]) return false;
		}

		return true;
	}

	public static String changeFor(int n, int i) {
		StringBuilder sb = new StringBuilder();

		int num = n;
		while (num > 0) {
			int temp = num % i;

			sb.append((char) temp);

			num /= i;
		}

		return sb.toString();
	}
}