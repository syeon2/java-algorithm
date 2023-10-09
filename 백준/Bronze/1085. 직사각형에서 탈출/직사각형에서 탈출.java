import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int minX = Math.min(Math.abs(x), Math.abs(x - w));
		int minY = Math.min(Math.abs(y), Math.abs(y - h));

		int ans = Math.min(minX, minY);
		bw.write(String.valueOf(ans));
		bw.flush();
		bw.close();
	}
}