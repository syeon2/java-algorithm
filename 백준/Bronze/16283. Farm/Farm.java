import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());

		int ansSheep = -1;
		int ansGoat = -1;
        
        int cnt = 0;

		// i는 양
		for (int i = 1; i < n; i++) {

			// 염소
			int goat = n - i;

			int feed = (i * a) + (b * goat);

			if (goat > 0 && feed == w) {
				ansSheep = i;
				ansGoat = goat;
                cnt++;
			}
		}

		if (ansSheep == -1 || cnt > 1) bw.write("-1");
		else {
			bw.write(String.format("%d %d", ansSheep, ansGoat));
		}

		bw.flush();
		bw.close();
	}
}
