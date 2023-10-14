import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] aList = new int[N];
		int[] bList = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			aList[i] = Integer.parseInt(st.nextToken());
			bList[i] = Integer.parseInt(st2.nextToken());
		}

		Arrays.sort(aList);
		Arrays.sort(bList);

		int total = 0;

		for (int i = 0; i < N; i++) {
			total += aList[i] * bList[N - 1 - i];
		}

		bw.write(String.valueOf(total));
		bw.flush();
		bw.close();
	}
}