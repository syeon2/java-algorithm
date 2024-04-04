import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        Obj[] list = new Obj[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            list[i] = new Obj(age, name);
        }
        
        Arrays.sort(list, new Comparator<>() {
            @Override
            public int compare(Obj a, Obj b) {
                return a.age - b.age;
            }
        });
        
        for (int i = 0; i < N; i++) {
            sb.append(list[i].age).append(" ").append(list[i].name).append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static class Obj {
        public int age;
        public String name;
        
        public Obj(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}