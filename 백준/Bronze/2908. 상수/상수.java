import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        
        int reA = Integer.parseInt(reverse(A));
        int reB = Integer.parseInt(reverse(B));
        
        bw.write(String.valueOf(Math.max(reA, reB)));
        bw.flush();
        bw.close();
    }
    
    public static String reverse(String n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = n.length() - 1; i >= 0; i--) {
            sb.append(n.charAt(i));
        }
        
        return sb.toString();
    }
}