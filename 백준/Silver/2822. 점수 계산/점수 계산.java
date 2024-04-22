import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Obj[] list = new Obj[8];

        for (int n = 0; n < 8; n++) {
            list[n] = new Obj(n + 1, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(list, (a, b) -> {
            return b.value - a.value;
        });

        int total = 0;
        Obj[] ans = new Obj[5];
        for (int i = 0; i < 5; i++) {
            ans[i] = list[i];
            total += ans[i].value;
        }

        Arrays.sort(ans, (a, b) -> {
            return a.order - b.order;
        });

        StringBuilder sb = new StringBuilder();
        sb.append(total).append("\n");
        for (int i = 0; i < 5; i++) {
            sb.append(ans[i].order).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static class Obj {
        public int order;
        public int value;

        public Obj(int order, int value) {
            this.order = order;
            this.value = value;
        }
    }
}