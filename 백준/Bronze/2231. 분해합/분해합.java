import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
        
        int start = 0;
        
        if (start <= 10) start /= 2;
        else if (start <= 100) start -= 10;
        else start -= 100;

		for (int i = start; i <= N; i++) {
			int num = d(i);

			if (N == num) {
				System.out.println(i);
				return;
			}
		}
        
        System.out.println(0);
	}

	public static int d(int num) {
		int temp = num;

		while (temp > 0) {
			num += temp % 10;
			temp /= 10;
		}

		return num;
	}
}
