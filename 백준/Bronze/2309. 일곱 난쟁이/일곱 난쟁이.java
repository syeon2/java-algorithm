import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 아옵명 중 7명을 찾는 문제 -> 역으로 나머지 2명을 찾아내면 7명을 구할 수 있다.
		// 전체 N은 100을 넘지 않고 2명을 찾으면 되는 문제이기 때문에 Brute Force 알고리즘으로 풀어낼 수 있다.

		int total = 0;
		int[] list = new int[9];
		for (int i = 0; i < 9; i++) {
			list[i] = Integer.parseInt(br.readLine());
			total += list[i];
		}

		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			for (int k = i + 1; k < list.length; k++) {
				if (total - list[i] - list[k] == 100) {

					for (int l = 0; l < list.length; l++) {
						if (l == i || l == k) continue;
						bw.write(String.valueOf(list[l]));
						bw.newLine();
					}

					bw.flush();
					bw.close();
					return;
				}
			}
		}
    }
}
