import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Student[] list = new Student[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(list, (a, b) -> {
            if (a.korean == b.korean) {
                if (a.english == b.english) {
                    if (a.math == b.math) {
                        return a.name.compareTo(b.name);
                    }

                    return b.math - a.math;
                }

                return a.english - b.english;
            }

            return b.korean - a.korean;
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(list[i].name).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static class Student {
        public String name;
        public int korean;
        public int english;
        public int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}