import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] list = br.readLine().split("");

		Arrays.sort(list, Collections.reverseOrder());

		String ans = "";
		for (String s : list) {
			ans = ans.concat(s);
		}

		bw.write(ans);
		bw.flush();
		bw.close();
	}
}
