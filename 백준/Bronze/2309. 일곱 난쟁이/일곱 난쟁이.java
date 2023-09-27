import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> list = new ArrayList<>();
        int[] nList = new int[9];
		int total = 0;

		for (int i = 0; i < 9; i++) {
			nList[i] = Integer.parseInt(br.readLine());
			total += nList[i];
		}

		for (int i = 0; i < 9; i++) {
			boolean find = false;

			for (int k = i + 1; k < 9; k++) {
				if (total - nList[i] - nList[k] == 100) {
					find = true;

					for (int l = 0; l < 9; l++) {
						if (l != i && l != k) {
							list.add(nList[l]);
						}
					}
				}
			}

			if (find) break;
		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			bw.write(String.valueOf(list.get(i)));
			bw.newLine();
		}

		bw.flush();
		bw.close();
    }
}