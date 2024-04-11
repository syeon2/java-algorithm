import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        double circle = Math.PI * (N * N);
        double taxi = (double) ((N + N) * (N + N)) / 2;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.6f\n%.6f", circle, taxi));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}