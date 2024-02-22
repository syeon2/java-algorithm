import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        int[] list = new int[10001];
        int idx = -1;
        
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            String cmd = st.nextToken();
            
            if (cmd.equals("push_front")) {
                for (int i = idx; i >= 0; i--) {
                    list[i + 1] = list[i];
                }
                
                list[0] = Integer.parseInt(st.nextToken());
                idx++;
            } else if (cmd.equals("push_back")) {
                list[++idx] = Integer.parseInt(st.nextToken());
            } else if (cmd.equals("pop_front")) {
                if (idx == -1) sb.append(-1).append("\n");
                else {
                    sb.append(list[0]).append("\n");
                    
                    for (int i = 0; i < idx; i++) {
                        list[i] = list[i + 1];
                    }
                    
                    list[idx--] = 0;
                }
            } else if (cmd.equals("pop_back")) {
                if (idx == -1) sb.append(-1).append("\n");
                else {
                    sb.append(list[idx]).append("\n");
                
                    list[idx--] = 0;
                }
            } else if (cmd.equals("size")) {
                sb.append(idx + 1).append("\n");
            } else if (cmd.equals("empty")) {
                if (idx == -1) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            } else if (cmd.equals("front")) {
                if (idx == -1) sb.append(-1).append("\n");
                else sb.append(list[0]).append("\n");
            } else {
                if (idx == -1) sb.append(-1).append("\n");
                else sb.append(list[idx]).append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}