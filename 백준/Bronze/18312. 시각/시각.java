import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int startSec = 0;
		int startMin = 0;
		int startHour = 0;

		int ans = 0;

		while (true) {
			if (startHour == N + 1) break;

			String sec = String.valueOf(startSec);
			if (startSec < 10) sec = "0".concat(sec);

			String min = String.valueOf(startMin);
			if (startMin < 10) min = "0".concat(min);

			String hour = String.valueOf(startHour);
			if (startHour < 10) hour = "0".concat(hour);

			if (sec.contains(String.valueOf(K))) ans++;
			else if (min.contains(String.valueOf(K))) ans++;
			else if (hour.contains(String.valueOf(K))) ans++;

			startSec++;

			if (startSec == 60) {
				startSec = 0;
				startMin += 1;
			}

			if (startMin == 60) {
				startMin = 0;
				startHour += 1;
			}
		}


		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}
