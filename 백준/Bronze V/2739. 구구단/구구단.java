import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= 9; i++) {
            bw.write(getSentence(N, i));
        }
        
        bw.flush();
        bw.close();
    }
    
    public static String getSentence(int n, int i) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
        
        return sb.toString();
    }
}