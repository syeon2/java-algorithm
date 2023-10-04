import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int answer = 666;

		if (N == 1)
			System.out.println(answer);
		else {
			for (int i = 2; i <= N; i++) {

				int temp = answer + 1;

				while (!String.valueOf(temp).contains("666")) {
					temp++;
				}

				answer = temp;
			}
            
            System.out.println(answer);
		}
	}
}
