import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[10001];
        
        for (int i = 0; i < N; i++) {
            int idx = Integer.parseInt(br.readLine());
            
            list[idx]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            int cnt = list[i];
            
            while (cnt-- > 0) {
                sb.append(i).append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}