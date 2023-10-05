import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;

		int N = Integer.parseInt(br.readLine());
		int temp = N;

		int count = 0;

		do {
			sb = new StringBuilder();
			char[] list = String.valueOf(temp).toCharArray();
			int sum = 0;

			if (list.length == 1) {
				sum = list[0] - '0';

				sb.append(sum).append(sum);

				temp = Integer.parseInt(sb.toString());
				count++;
			} else {
				sum = (list[0] - '0') + (list[1] - '0');
				
				char[] list2 = String.valueOf(sum).toCharArray();

				if (list2.length == 1) {
					sb.append(list[1] - '0').append(list2[0] - '0');

					temp = Integer.parseInt(sb.toString());
					count++;
				} else {
					sb.append(list[1] - '0').append(list2[1] - '0');

					temp = Integer.parseInt(sb.toString());
					count++;
				}

			}
		} while (temp != N);

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
