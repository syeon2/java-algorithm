import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int up = Integer.parseInt(br.readLine());
        int mid = Integer.parseInt(br.readLine());
        int down = Integer.parseInt(br.readLine());
        
        int coc = Integer.parseInt(br.readLine());
        int si = Integer.parseInt(br.readLine());
        
        int lowB = Math.min(up, Math.min(mid, down));
        int lowD = Math.min(coc, si);
        
        bw.write(String.valueOf(lowB + lowD - 50));
        bw.flush();
        bw.close();
    }
}