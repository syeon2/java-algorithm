import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        double score = 0;
        double cnt = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            double s = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) continue;
            else {
                double sScore = (grade.equals("A+")) ? 4.5 : (grade.equals("A0")) ? 4.0 : (grade.equals("B+")) ? 3.5 : (grade.equals("B0")) ? 3.0 : (grade.equals("C+")) ? 2.5 : (grade.equals("C0")) ? 2.0 : (grade.equals("D+")) ? 1.5 : (grade.equals("D0")) ? 1.0 : 0;

                score += sScore * s;
                cnt += s;
            }
        }

        double avg = (cnt == 0) ? 0 : score / cnt;

        bw.write(String.format("%.6f", avg));
        bw.flush();
        bw.close();
    }
}