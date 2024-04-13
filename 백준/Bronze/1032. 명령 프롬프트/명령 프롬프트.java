import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list[0].length(); i++) {
            char c = list[0].charAt(i);
            boolean flag = true;
            
            for (int k = 0; k < N; k++) {
                if (list[k].charAt(i) != c) flag = false;
            }
            
            if (flag) sb.append(c);
            else sb.append("?");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}