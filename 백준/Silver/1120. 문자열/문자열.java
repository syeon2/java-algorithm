import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		char[] aList = st.nextToken().toCharArray();
		char[] bList = st.nextToken().toCharArray();

		int min = 50;

		for (int i = 0; i <= bList.length - aList.length; i++) {
			int count = 0;

			for (int k = i; k < i + aList.length; k++) {
				if (bList[k] != aList[k - i]) count++;
			}

			if (min > count) min = count;
		}

		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
	}
}