import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] list = new String[N];
		for (int i = 0; i < N; i++) {
			list[i] = br.readLine();
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {

			int[] alp = new int[26];

			for (int k = 0; k < N; k++) {
				char c = list[k].charAt(i);

				alp[c - 'A']++;
			}

			int max = alp[0];
			char s = 'A';

			for (int k = 1; k <= 25; k++) {
				if (max < alp[k]) {
					max = alp[k];
					s = (char) (k + 'A');
				}
			}

			sb.append(s);
		}
        
        String ansStr = sb.toString();
        
        int ansMin = 0;
        for (int i = 0; i < M; i++) {
            
            for (int k = 0; k < N; k++) {
                if (ansStr.charAt(i) != list[k].charAt(i)) ansMin++;
            }
        }

		bw.write(ansStr);
        bw.newLine();
        bw.write(String.valueOf(ansMin));
		bw.flush();
		bw.close();
	}
}
