import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 1; i <= N; i++) {

			if (i < 100)
				count++;
			else {
				char[] list = String.valueOf(i).toCharArray();

				int gap = list[0] - list[1];

				boolean flag = true;
				for (int k = 1; k < list.length - 1; k++) {
					if (list[k] - list[k + 1] != gap) {
						flag = false;
						break;
					}
				}

				if (flag)
					count++;
			}
		}

		System.out.println(count);
	}
}
