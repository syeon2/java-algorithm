import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

        // 나머지 연산의 특징을 이용한다.
		// (n * m) % c 와 ((n % c) * (m % c)) % c는 같다는 성질을 이용하기
		// ((1 % x) * (10 % x) + 1) % c

		String str;
		while ((str = br.readLine()) != null) {
			int N = Integer.parseInt(str);
			// 반복문으로 ((1 % N) * (10 % N) + 1) % N 을 반복한다.

			int num = 1;
			int cnt = 1;
			while (num % N != 0) {
				num = (num * 10 + 1) % N;
				cnt++;
			}

			sb.append(cnt).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
    }
}
