import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<String> set = new HashSet<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}

		List<String> arrList = new ArrayList<>(set);
		arrList.sort(Comparator.comparingInt(String::length));

		String[] list = arrList.toArray(String[]::new);

		for (int i = 0; i < list.length - 1; i++) {

			int k = i;
			while (k < list.length - 1) {
				if (list[i].length() == list[k + 1].length()) k++;
				else break;
			}

			for (int j = i + 1; j <= k; j++) {
				if (list[i].compareTo(list[j]) > 0) {
					String temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}

		for (String s : list) {
			System.out.println(s);
		}
	}
}