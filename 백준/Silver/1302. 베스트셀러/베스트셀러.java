import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        String ansName = "";
        int maxSell = 0;

        for (int n = 0; n < N; n++) {
            String name = br.readLine();

            if (map.containsKey(name)) map.replace(name, map.get(name) + 1);
            else map.put(name, 1);

            if (map.get(name) > maxSell) {
                ansName = name;
                maxSell = map.get(name);
            } else if (map.get(name) == maxSell) {
                if (ansName.compareTo(name) > 0) ansName = name;
            }
        }

        bw.write(ansName);
        bw.flush();
        bw.close();
    }
}