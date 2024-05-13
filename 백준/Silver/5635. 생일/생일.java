import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Obj[] list = new Obj[N];

        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            list[n] = new Obj(st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }

        Arrays.sort(list, (a, b) -> {
            if (a.year == b.year) {
                if (a.month == b.month) {
                    return b.date - a.date;
                }

                return b.month - a.month;
            }

            return b.year - a.year;
        });

        bw.write(String.valueOf(list[0].name));
        bw.newLine();
        bw.write(String.valueOf(list[N - 1].name));

        bw.flush();
        bw.close();
    }

    public static class Obj {
        public String name;
        public int date;
        public int month;
        public int year;

        public Obj(String name, int date, int month, int year) {
            this.name = name;
            this.date = date;
            this.month = month;
            this.year = year;
        }
    }
}