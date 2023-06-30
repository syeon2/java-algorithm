import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		if (str.equals("0")) {
			bw.write(String.valueOf(0));
			bw.flush();
			bw.close();
			return;
		}

		int front = str.length() % 3;

		String fStr = str.substring(0, front);
		if (fStr.length() == 1 && fStr.charAt(0) == '1') sb.append(1);
		else if (fStr.length() == 2) {
			int total = 0;
			if (fStr.charAt(0) == '1') total += 2;
			if (fStr.charAt(1) == '1') total += 1;

			sb.append(total);
		}

		String rStr = str.substring(front);

		for (int i = 0; i < rStr.length(); i += 3) {
			String s = rStr.substring(i, i + 3);

			int total = 0;
			if (s.charAt(0) == '1') total += 4;
			if (s.charAt(1) == '1') total += 2;
			if (s.charAt(2) == '1') total += 1;

			sb.append(total);
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
