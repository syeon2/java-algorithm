import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) bw.write("*");
        else {
            StringBuilder sb = new StringBuilder();

            if (N % 2 == 0) {
                for (int i = 1; i <= (N * 2); i++) {
                    if (i % 2 == 1) {
                        for (int k = 1; k <= (N / 2); k++) {
                            sb.append("* ");
                        }
                        sb.append("\n");
                    } else {
                        for (int k = 1; k <= (N / 2); k++) {
                            sb.append(" *");
                        }
                        sb.append("\n");
                    }
                }
            } else {
                for (int i = 1; i <= (N * 2); i++) {
                    if (i % 2 == 1) {
                        for (int k = 1; k <= (N / 2) + 1; k++) {
                            sb.append("* ");
                        }
                        sb.append("\n");
                    } else {
                        for (int k = 1; k <= (N / 2); k++) {
                            sb.append(" *");
                        }
                        sb.append("\n");
                    }
                }
            }

            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
}