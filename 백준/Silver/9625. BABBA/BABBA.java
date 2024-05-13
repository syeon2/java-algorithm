import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int aCnt = 1;
        int bCnt = 0;

        while (N-- > 0) {
            int temp = aCnt;
            aCnt = bCnt;
            bCnt = temp + bCnt;
        }

        bw.write(aCnt + " " + bCnt);
        bw.flush();
        bw.close();
    }
}