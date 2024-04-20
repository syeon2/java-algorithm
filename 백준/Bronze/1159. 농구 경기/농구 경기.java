import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<Character, Integer> map = new TreeMap<>();
        for (int n = 0; n < N; n++) {
            char c = br.readLine().charAt(0);

            if (map.containsKey(c)) map.replace(c, map.get(c) + 1);
            else map.put(c, 1);
        }

        boolean have = false;

        for (Character c : map.keySet()) {
            if (map.get(c) >= 5) {
                sb.append(c);
                have = true;
            }
        }

        if (have)  bw.write(sb.toString());
        else bw.write("PREDAJA");

        bw.flush();
        bw.close();
    }
}