import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		bw.write(String.valueOf(gcd(Math.max(A, B), Math.min(A, B))));
		bw.newLine();
		bw.write(String.valueOf(lcm(Math.max(A, B), Math.min(A, B))));
		bw.flush();
		bw.close();
    }

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		return (a / gcd) * (b / gcd) * gcd;
	}
}
