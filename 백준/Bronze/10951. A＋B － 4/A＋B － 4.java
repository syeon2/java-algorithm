import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s;
        
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s, " ");
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            bw.write(String.valueOf(A + B));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}