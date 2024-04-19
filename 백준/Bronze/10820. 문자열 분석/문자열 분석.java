import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        String str;
        
        while ((str = br.readLine()) != null) {
            int[] list = new int[4];
            for (int i = 0; i < str.length(); i++) {
                int idx = getIdx(str.charAt(i));
                
                list[idx]++;
            }
            
            for (int i = 0; i < 4; i++) {
                sb.append(list[i]).append(" ");
            }
            
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    
    public static int getIdx(char c) {
        if (c >= 'a' && c <= 'z') return 0;
        else if (c >= 'A' && c <= 'Z') return 1;
        else if (c >= '0' && c <= '9') return 2;
        else return 3;
    }
}