import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// N보다 작은 자연수의 모든 약수의 합을 구하는 문제
		// 단순한 반복문으로는 시간초과가 발생 -> 각 값을 나누고 개수를 갑과 곱해 더하는 방법

        long N = Integer.parseInt(br.readLine());

		long answer = 0;
		for (int i = 1; i <= N; i++) {
			answer += (N / i) * i;
		}


		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
    }
}
