import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int D = Integer.parseInt(br.readLine());

        int addedH = D / 3600;
        int addedM = (D % 3600) / 60;
        int addedS = (D % 3600) % 60;

        if (S + addedS >= 60) {
            M++;
            S = (S + addedS) - 60;
        } else S = S + addedS;

        if (M + addedM >= 60) {
            H++;
            M = (M + addedM) - 60;
        } else M = M + addedM;

        if (H + addedH >= 24) {
            H = (H + addedH) % 24;
        } else H = H + addedH;

        bw.write(H + " " + M + " " + S);
        bw.flush();
        bw.close();
    }
}