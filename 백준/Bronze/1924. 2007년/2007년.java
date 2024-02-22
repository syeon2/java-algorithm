import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int days = y;
		for (int i = 1; i < x; i++) {
			days += month[i];
		}

		bw.write(String.valueOf(dayOfWeek[days % 7]));
		bw.flush();
		bw.close();
	}
}
