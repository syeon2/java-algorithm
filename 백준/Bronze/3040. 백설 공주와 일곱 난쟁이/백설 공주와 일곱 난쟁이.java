import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int total = 0;
        int[] list = new int[9];
        for (int i = 0; i < 9; i++) {
            list[i] = Integer.parseInt(br.readLine());
            total += list[i];
        }

        boolean isEnd = false;

        for (int i = 0; i < 9; i++) {
            for (int k = i + 1; k < 9; k++) {
                if (total - list[i] - list[k] == 100) {

                    for (int j = 0; j < 9; j++) {
                        if (j == i || j == k) continue;

                        sb.append(list[j]).append("\n");
                    }

                    isEnd = true;
                    break;
                }
            }

            if (isEnd) break;
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}