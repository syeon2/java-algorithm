import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        for (int n = 0; n < N; n++) {
            Long num = Long.parseLong(br.readLine());

            if (map.containsKey(num)) map.replace(num, map.get(num) + 1);
            else map.put(num, 1);
        }

        int ansCnt = 0;
        long ansValue = 0;

        for (long key : map.keySet()) {
            long num = key;
            int cnt = map.get(key);

            if (cnt > ansCnt) {
                ansCnt = cnt;
                ansValue = num;
            } else if (cnt == ansCnt && ansValue > num) {
                ansCnt = cnt;
                ansValue = num;
            }
        }

        bw.write(String.valueOf(ansValue));
        bw.flush();
        bw.close();
    }
}