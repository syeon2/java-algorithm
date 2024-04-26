import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] list = br.readLine().split(" ");

            double start = Double.parseDouble(list[0]);

            for (int i = 1; i < list.length; i++) {
                if (list[i].equals("@")) start *= 3;
                else if (list[i].equals("%")) start += 5;
                else start -= 7;
            }

            sb.append(String.format("%.2f", start)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}