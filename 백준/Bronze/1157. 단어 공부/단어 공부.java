import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] list = br.readLine().toCharArray();

        int[] alp = new int[26];

        for (int i = 0; i < list.length; i++) {
            if (list[i] >= 'A' && list[i] <= 'Z') {
                int idx = list[i] - 'A';
                alp[idx]++;
            } else {
                int idx = list[i] - 'a';

                alp[idx]++;
            }
        }

        int idx = 0;
        int maxCnt = 0;
        int cnt = 0;

        for (int i = 0; i < 26; i++) {
            if (maxCnt < alp[i]) {
                idx = i;
                maxCnt = alp[i];
                cnt = 1;
            } else if (maxCnt == alp[i]) {
                cnt++;
            }
        }

        if (cnt == 1) bw.write(String.valueOf((char) (idx + 'A')));
        else bw.write("?");

        bw.flush();
        bw.close();
    }
}