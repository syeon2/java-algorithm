import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());

		int D = Integer.parseInt(br.readLine());
		int E = Integer.parseInt(br.readLine());

		int burger = Math.min(A, Math.min(B, C));
		int veberage = Math.min(D, E);

		bw.write(String.valueOf(burger + veberage - 50));
		bw.flush();
		bw.close();
	}
}
