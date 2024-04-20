import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[N];
        for (int n = 0; n < N; n++) {
            list[n] = Integer.parseInt(st.nextToken());
        }

        int young = 0;
        for (int i = 0; i < N; i++) {
            young += 10;
            young += (list[i] / 30) * 10;
        }

        int min = 0;
        for (int i = 0; i < N; i++) {
            min += 15;
            min += (list[i] / 60) * 15;
        }

        if (young > min) bw.write("M " + min);
        else if (young < min) bw.write("Y " + young);
        else bw.write("Y M " + min);

        bw.flush();
        bw.close();
    }
}