import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		int answerM = (M + m) % 60;
		int answerH = (H + ((M + m) / 60)) % 24;

		bw.write(String.valueOf(answerH));
		bw.write(" ");
		bw.write(String.valueOf(answerM));

		bw.flush();
		bw.close();
	}
}