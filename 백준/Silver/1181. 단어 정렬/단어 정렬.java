import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }

        Arrays.sort(list, new Comparator<>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }

                return a.length() - b.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        String prev = "";
        for (int i = 0; i < N; i++) {
            if (!prev.equals(list[i])) sb.append(list[i]).append("\n");

            prev = list[i];
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}